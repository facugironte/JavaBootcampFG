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
	
	public ArrayList<Ciudad> obtenerCiudades() throws DBManagerException{
		ArrayList<Ciudad> ciudades = new ArrayList<Ciudad>();
		
		String query = "select id, descripcion, id_pais from ciudades";
		Statement statement = null;
		ResultSet  resultSet = null;
		
		try {
			statement = conn.createStatement();
			resultSet = statement.executeQuery(query);
			
			while(resultSet.next()) {
				int id = resultSet.getInt(1);
				String descripcion = resultSet.getString(2);
				int id_pais = resultSet.getInt(3);
				
				ciudades.add(new Ciudad(id, descripcion, id_pais));
				
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