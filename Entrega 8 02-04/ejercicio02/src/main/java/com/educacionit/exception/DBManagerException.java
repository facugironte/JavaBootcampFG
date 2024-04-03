package com.educacionit.exception;

public class DBManagerException extends Exception{
	
	public static final int ERROR_1 = 1; //Conectarse
	public static final int ERROR_2 = 2; //Cerrar conexión
	public static final int ERROR_3 = 3; //Buscar ciudades
	public static final int ERROR_4 = 4; //Insertar ciudad
	public static final int ERROR_5 = 5; //Eliminar ciudad
	public static final int ERROR_6 = 6; //Modificar ciudad
	
	
	private int error;
	
	public DBManagerException(Integer error, String message) {
		super(message);
		this.error = error;
	}

	public DBManagerException(Integer error, Throwable cause) {
		super(cause);
		this.error = error;
	}

	public DBManagerException(Integer error, String message, Throwable cause) {
		super(message, cause);
		this.error = error;
	}
	
	public String getMessage() {
		switch (error) {
		case ERROR_1:
			return "Se produjo un error conectando a la DB. Error: " + super.getMessage();
		case ERROR_2:
			return "Se produjo un error cerrando la conexión. Error: " + super.getMessage();
		case ERROR_3:
			return "Se produjo un error buscando las ciudades. Error: " + super.getMessage();
		case ERROR_4:
			return "Se produjo un error insertando una ciudad. Error: " + super.getMessage();
		case ERROR_5:
			return "Se produjo un error eliminando una ciudad. Error: " + super.getMessage();
		case ERROR_6:
			return "Se produjo un error modificando una ciudad. Error: " + super.getMessage();
		default:
			return super.getMessage();
		}
	}


}
