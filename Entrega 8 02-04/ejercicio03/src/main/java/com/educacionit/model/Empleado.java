package com.educacionit.model;

public class Empleado {

	private Integer legajo;
	private String nombre;
	private String cargo;
	
	public Empleado(Integer legajo, String nombre, String cargo) {
		super();
		this.legajo = legajo;
		this.nombre = nombre;
		this.cargo = cargo;
	}
	
	public Integer getLegajo() {
		return legajo;
	}

	public void setLegajo(Integer legajo) {
		this.legajo = legajo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}


	
	

}
