package com.educacionit.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.educacionit.controller.AlumnoController;
import com.educacionit.model.Alumno;
import com.educacionit.repository.AlumnoRepository;
import com.educacionit.service.AlumnoService;

@Service("alumnoService")
public class AlumnoServiceImpl implements AlumnoService {
	
	private static final Logger logger = LoggerFactory.getLogger(AlumnoServiceImpl.class);

	@Autowired
	@Qualifier("alumnoRepository")
	private AlumnoRepository  alumnoRepository;
	
	@Override
	public List<Alumno> getAllAlumnos() {
		return alumnoRepository.finAll();
	}

	@Override
	public Alumno getalumnoById(int legajo) {
		return alumnoRepository.findById(legajo);
	}

	@Override
	public void addAlumno(Alumno alumno) {
		logger.info("Agregar alumno con nombre {}: . Toda la clase: {}", alumno.getNombre(), alumno);
		
		alumnoRepository.save(alumno);
		
	}

	@Override
	public void updateAlumno(int legajo, Alumno alumno) {
		Alumno existeAlumno = alumnoRepository.findById(legajo);
		if (existeAlumno != null) {
			existeAlumno.setNombre(alumno.getNombre());
			existeAlumno.setEdad(alumno.getEdad());
		}
		
	}

	@Override
	public void deleteAlumno(int legajo) {
		alumnoRepository.delete(legajo);
		
	}

}
