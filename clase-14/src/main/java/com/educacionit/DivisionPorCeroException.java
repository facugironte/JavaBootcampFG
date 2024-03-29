package com.educacionit;

public class DivisionPorCeroException extends Exception {

	public DivisionPorCeroException(String message) {
		super(message);
	}

	public DivisionPorCeroException(Throwable cause) {
		super(cause);
	}

	public DivisionPorCeroException(String message, Throwable cause) {
		super(message, cause);
	}

}
