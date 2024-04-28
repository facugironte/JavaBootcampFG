package com.educationit.service;

import java.util.List;

import com.educationit.model.Alumno;

public interface AlumnoService {

	List<Alumno> getAllAlumnos();
	Alumno getAlumnoByID(int legajo);
	void addAlumno(Alumno alumno);
	void updateAlumno(int legajo, Alumno alumno);
	void deleteAlumno(int legajo);
	
}
