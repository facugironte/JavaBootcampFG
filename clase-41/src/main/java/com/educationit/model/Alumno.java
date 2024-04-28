package com.educationit.model;

public class Alumno {
	private Integer legajo;
	private String nombre;
	private Integer edad;
	
	public Alumno() {
		super();
		// TODO Auto-generated constructor stub
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
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	
	@Override
	public String toString() {
		return this.legajo + " " + this.nombre + " " + this.edad;
	}
	
	
	
	
	
}
