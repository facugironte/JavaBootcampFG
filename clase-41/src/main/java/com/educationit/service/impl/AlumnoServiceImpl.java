package com.educationit.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.educationit.model.Alumno;
import com.educationit.repository.AlumnoRepository;
import com.educationit.service.AlumnoService;

@Service("alumnoService")
public class AlumnoServiceImpl implements AlumnoService {
	
	@Autowired
	@Qualifier("alumnoRepository")
	private AlumnoRepository alumnoRepository;
	
	@Override
	public List<Alumno> getAllAlumnos() {
		return alumnoRepository.findAll();
	}

	@Override
	public Alumno getAlumnoByID(int legajo) {
		return alumnoRepository.findByID(legajo);
	}

	@Override
	public void addAlumno(Alumno alumno) {
		alumnoRepository.save(alumno);
	}

	@Override
	public void updateAlumno(int legajo, Alumno alumno) {
		
		Alumno existeAlumno = alumnoRepository.findByID(legajo);
		
		if(existeAlumno != null) {
			existeAlumno.setNombre(alumno.getNombre());
			existeAlumno.setEdad(alumno.getEdad());
		}

	}

	@Override
	public void deleteAlumno(int legajo) {
		alumnoRepository.delete(legajo);

	}

}
