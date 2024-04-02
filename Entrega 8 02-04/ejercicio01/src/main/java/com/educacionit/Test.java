package com.educacionit;

import java.util.ArrayList;

import com.educacionit.exception.DBManagerException;

public class Test {

	public static void main(String[] args) throws DBManagerException {
		
		 
		DBManager dbManager = new DBManager();
		
		dbManager.conectar("bootcamp", "root", "1906");
		
		
		ArrayList<Ciudad> ciudades = dbManager.obtenerCiudades();
		
		for(Ciudad c: ciudades) {
			System.out.println(c.getDesc());
		}
			
		
		dbManager.cerrarConexion();
	}

}
