package com.educacionit.repository;

import java.util.List;

import com.educacionit.model.Alumno;

public interface AlumnoRepository {
	
	List<Alumno> finAll();
	Alumno findById(int legajo);
	void save(Alumno alunmno);
	void delete(int legajo);

}
