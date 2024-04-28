package com.educationit.singleton;

import org.apache.logging.log4j.CloseableThreadContext.Instance;

public class Singleton {
	
	private static Singleton _instance;
	private String funcionalidad2;
	
	
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		
		if(_instance == null) {
			_instance = new Singleton();
		}
		
		return _instance;
	}
	
	public void funcionalidad1() {
		System.out.println("funcionalidad1");
	}
	
	public String funcionalidad2() {
		funcionalidad2 = "hola mundo";
		return funcionalidad2;
		
	}
	
}
