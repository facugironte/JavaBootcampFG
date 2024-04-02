package com.educacionit.exception;

public class DBManagerException extends Exception{
	
	public static final int ERROR_1 = 1; //Conectarse
	public static final int ERROR_2 = 2; //Cerrar conexión
	public static final int ERROR_3 = 3; //Obtener ciudades
	
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
		default:
			return super.getMessage();
		}
	}


}
