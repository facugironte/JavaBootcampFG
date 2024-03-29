package com.educacionit;

import java.util.ArrayList;

import com.educacionit.exception.DBManagerException;
import com.educacionit.exception.DBManagerObtenerAlumnoException;

public class TestDBManager2 {

	public static void main(String[] args) {

		ArrayList<Alumno> alumnos = null;
		DBManager dbManager = new DBManager();

		
		try {
			
			dbManager.conectar();
			
			dbManager.obtenerAlumno(-1);
			
			alumnos = dbManager.obtenerAlumnos();
			
			
		} catch (DBManagerObtenerAlumnoException exec) {
			System.out.println("No fue posible encontrar al alumno. Err: " + exec.getMessage());
		} catch (DBManagerException exec) {
			System.out.println("Se produjo un error: " + exec.getMessage());
		} finally {
			try {
				dbManager.cerrarConexion();
			} catch (DBManagerException exec) {
				System.out.println(exec.getMessage());
			}
		}
		
		
		
		
		
		/*try {
			dbManager.conectar();
		} catch (DBManagerException exec) {
			System.out.println("Se produjo un error al conectar con la DB");
		}
		
		try {
			dbManager.mostrarAlumnos();
		} catch (DBManagerException exec) {
			System.out.println("Se produj un eror mostrando los alumnos");
		}
		
		try {
			alumnos = dbManager.obtenerAlumnos();
			
			// Mostramos la coleccion de alumnos
			for (int indice = 0; indice < alumnos.size(); indice++) {
				Alumno unAlumno = alumnos.get(indice);
				System.out.println("Alumno: " + unAlumno);
			}			
		} catch (DBManagerException exec) {
			System.out.println("Se produjo un error obteniendo los alumnos");
		}*/
		
		
		
		


	}

}
