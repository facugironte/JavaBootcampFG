package com.educacionit;

import java.util.ArrayList;
import java.util.Scanner;

import com.educacionit.exception.DBManagerException;

public class Test {

	public static void main(String[] args) throws DBManagerException {
		 
		Scanner scanner = new Scanner(System.in);
		DBManager dbManager = new DBManager();
		
		
		dbManager.conectar("bootcamp", "root", "1906");
		
		System.out.print("Ingrese una ciudad a buscar: ");
		ArrayList<Ciudad> ciudades = dbManager.obtenerCiudades(scanner.nextLine());
		
		for(Ciudad c: ciudades) {
			System.out.println(c.getDesc());
		}
			
		
		dbManager.cerrarConexion();
		scanner.close();
	}

}
