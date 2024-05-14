package com.educacionit.singleton;

public class MainSingleton {

	public static void main(String[] args) {
		
		Singleton miSingleton = Singleton.getInstance();
		miSingleton.funcionalidad1();
		System.out.println(miSingleton.funcionalidad2() );
		
		Singleton miSingleton2 = Singleton.getInstance();
		miSingleton2.funcionalidad1();
		System.out.println(miSingleton2.funcionalidad2() );
		
		if (miSingleton == miSingleton) {
			System.out.println("Los objetos son iguales");
		}
	}

}
