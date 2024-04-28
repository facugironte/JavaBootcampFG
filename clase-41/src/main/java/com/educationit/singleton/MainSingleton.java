package com.educationit.singleton;

public class MainSingleton {

	public static void main(String[] args) {
		
		Singleton singleton = Singleton.getInstance();
		
		singleton.funcionalidad1();
		System.out.println(singleton.funcionalidad2());
		
		Singleton singleton2 = Singleton.getInstance();
		singleton2.funcionalidad1();
		System.out.println(singleton2.funcionalidad2());
		
		if(singleton == singleton2) {
			System.out.println("Los objetos son iguales.");
		}
		
		
	}

}
