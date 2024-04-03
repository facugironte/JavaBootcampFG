package com.educacionit;

import java.util.ArrayList;
import java.util.Scanner;

import com.educacionit.exception.DBManagerException;

public class Test {

	public static void main(String[] args) throws DBManagerException {
		 
		Scanner scanner = new Scanner(System.in);
		DBManager dbManager = new DBManager();
		
		
		dbManager.conectar("bootcamp", "root", "1906");
		
		/*System.out.print("Ingrese una ciudad a buscar: ");
		ArrayList<Ciudad> ciudades = dbManager.obtenerCiudades(scanner.nextLine());
		
		for(Ciudad c: ciudades) {
			System.out.println(c.getDesc());
		}*/
		
		Ciudad ciudad = new Ciudad("Brasilia", 2);
		
		dbManager.insertarCiudad(ciudad);
		
		dbManager.modificarCiudad("Brasilia", "BrasiliaModificada"); //Este metodo se realizó de esta manera ya que es un solo campo el modificable, los otros dos son IDs.
		
		dbManager.eliminarCiudad("BrasiliaModificada");
			
		
		dbManager.cerrarConexion();
		scanner.close();
	}

}
