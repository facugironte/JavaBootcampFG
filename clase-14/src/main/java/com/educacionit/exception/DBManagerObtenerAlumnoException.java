package com.educacionit.exception;

public class DBManagerObtenerAlumnoException extends DBManagerException {

	public DBManagerObtenerAlumnoException(Integer error, String message, Throwable cause) {
		super(error, message, cause);
	}
	public DBManagerObtenerAlumnoException(Integer error, String message) {
		super(error, message);
	}

}
