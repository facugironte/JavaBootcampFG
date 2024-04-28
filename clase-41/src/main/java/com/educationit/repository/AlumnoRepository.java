package com.educationit.repository;

import java.util.List;

import com.educationit.model.Alumno;

public interface AlumnoRepository {

	List<Alumno> findAll();
	Alumno findByID(int legajo);
	void save(Alumno alumno);
	void delete(int legajo);
	
}
