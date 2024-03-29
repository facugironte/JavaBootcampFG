package com.educacionit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestConexion {

	public static void main(String[] args) throws SQLException {

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/bootcamp", "root", "1906");
		
		if (conn != null) {
			System.out.println("La conexion se establecio correctamente");
		}

		Statement stmt = conn.createStatement();
		ResultSet resultSet = stmt.executeQuery("select legajo, nombre, edad, especialidad from alumnos");
		
		while (resultSet.next()) {
			
			//Integer legajo =  resultSet.getInt("legajo");			
			Integer legajo =  resultSet.getInt(1);			
			//String nombre = resultSet.getString("nombre");
			String nombre = resultSet.getString(2);
			//Integer edad = resultSet.getInt("edad");
			Integer edad = resultSet.getInt(3);
			String especialidad = resultSet.getString("especialidad");
			
			System.out.printf("Legajo = [%d] - Nombre = [%s] - Edad = [%d] - Especialidad = [%s]\n", legajo, nombre, edad, especialidad);
		}
		
		resultSet.close();		
		stmt.close();		
		conn.close();
	}

}
