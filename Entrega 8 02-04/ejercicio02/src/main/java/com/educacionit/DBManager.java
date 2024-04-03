package com.educacionit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.educacionit.exception.DBManagerException;

public class DBManager {

	private Connection conn;

	public void conectar(String base, String user, String contraseña) throws DBManagerException {
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost/" + base, user, contraseña);
			System.out.println("La conexion se establecio correctamente");

		} catch (SQLException sqlExcex) {
			throw new DBManagerException(DBManagerException.ERROR_1, "No se pudo conectar con la DB", sqlExcex);
		}
	}
	
	public ArrayList<Ciudad> obtenerCiudades(String busqueda) throws DBManagerException{
		ArrayList<Ciudad> ciudades = new ArrayList<Ciudad>();
		
		String query = "SELECT id, descripcion, id_pais FROM ciudades WHERE LOWER(descripcion) LIKE '%" + busqueda.toLowerCase() + "%'"; //
		Statement statement = null;
		ResultSet  resultSet = null;
		
		try {
			statement = conn.createStatement();
			resultSet = statement.executeQuery(query);
			
			while(resultSet.next()) {
				String descripcion = resultSet.getString(2);
				int id_pais = resultSet.getInt(3);
				
				ciudades.add(new Ciudad(descripcion, id_pais));
				
			}
		} catch (SQLException sqlExcex) {
			throw new DBManagerException(DBManagerException.ERROR_3, "No fue posible obtener las ciudades por la siguiente causa: " + sqlExcex.getMessage(), sqlExcex);
		} finally {
			try {
				resultSet.close();
			} catch(SQLException ex) {
				System.err.println("No se pudo cerrar el resultset");
			}
			
			try {
				statement.close();
			} catch(SQLException ex) {
				System.err.println("No se pudo cerrar el statement");
			}
		}
		
		
		return ciudades;
		
	}
	
	public void insertarCiudad(Ciudad ciudad) throws DBManagerException{
		String query = "INSERT INTO ciudades (descripcion, id_pais) VALUES (?, ?)";
		
		PreparedStatement statement = null;
		
		try {
			statement = conn.prepareStatement(query);
			statement.setString(1, ciudad.getDesc());
			statement.setInt(2, ciudad.getIdPais());
			
			int rowsAffected = statement.executeUpdate();
			
			if (rowsAffected == 0) {
				throw new DBManagerException(DBManagerException.ERROR_4, "La ciudad no fue insertada");
			}
			System.out.println("Ciudad ingresada correctamente.");
		} catch (SQLException sqlExec) {
			throw new DBManagerException(DBManagerException.ERROR_4, "No pude insertar la ciudad", sqlExec);
		} finally {
			try {
				statement.close();
			} catch (SQLException e) {
				System.err.println("No se pudo cerrar el statement");
			}
		}
	}
	
	public void modificarCiudad(String ciudad, String cambio) throws DBManagerException{
		String query = "UPDATE ciudades set descripcion = ? WHERE LOWER(descripcion) = ?";
		PreparedStatement stm = null;
		try {
			stm = conn.prepareStatement(query);
			
			stm.setString(1, cambio);
			stm.setString(2, ciudad.toLowerCase());
			
			int rowsAffected = stm.executeUpdate();

			if (rowsAffected == 0) {
				throw new DBManagerException(DBManagerException.ERROR_6,
						"No fue posible modificar la ciudad " + ciudad);
			}
			
			System.out.println("La ciudad " + ciudad + " fue modificada y pasó a llamarse " + cambio);
		} catch (SQLException exec) {
			throw new DBManagerException(DBManagerException.ERROR_6, "No se pudo modificar la ciudad " + ciudad, exec);

		} finally {
			try {
				stm.close();
			} catch (SQLException exec) {
				System.err.println("No se pudo cerrar el statement. Error: " + exec.getMessage());
			}

		}
	}
	
	public void eliminarCiudad(String ciudad) throws DBManagerException{
		String query = "DELETE FROM ciudades WHERE LOWER(descripcion) = ?";
		PreparedStatement statement = null;
		try {
			statement = conn.prepareStatement(query);
			statement.setString(1, ciudad.toLowerCase());
			
			int rowsAffected = statement.executeUpdate();
			
			if(rowsAffected == 0) {
				throw new DBManagerException(DBManagerException.ERROR_5, "No fue posible eliminar la ciudad");
			}
			
			System.out.println("Se elimino la ciudad " + ciudad + " correctamente.");
			
		} catch (SQLException exec) {
			throw new DBManagerException(DBManagerException.ERROR_5,
					"No se pudo eliminar la ciudad. Error: " + exec.getMessage(), exec);

		} finally {
			try {
				statement.close();
			} catch (SQLException exec) {
				System.err.println("No se pudo cerrar el statement. Error: " + exec.getMessage());
			}
		}
	}
	
	public void cerrarConexion() throws DBManagerException {
		try {
			conn.close();
			System.out.println("Se cerro la conexion");
			
		} catch (SQLException exec) {
			throw new DBManagerException(DBManagerException.ERROR_2,
					"No pude cerrar la conexion con la db. Error: " + exec.getMessage(), exec);

		}
	}
	
}