package com.educacionit.repository.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.educacionit.dao.AlumnoDAO;
import com.educacionit.dao.AlumnoDAOImpl;
import com.educacionit.model.Alumno;
import com.educacionit.repository.AlumnoRepository;

@Repository("alumnoRepository")
public class AlumnoRepositoryImpl implements AlumnoRepository {
	
	private static List<Alumno>  alumnos = new ArrayList<>();
	
	public AlumnoRepositoryImpl() {
		super();
		alumnos.add(new Alumno(1234, "Nombre1234"));
		alumnos.add(new Alumno(5678, "Nombre5678"));
	}

	@Override
	public List<Alumno> getAll() {
		AlumnoDAO alumnoDao = new AlumnoDAOImpl();
		
		return alumnos;
	}

	@Override
	public Alumno save(Alumno alumno) {
		AlumnoDAO alumnoDao = new AlumnoDAOImpl();
		alumnos.add(alumno);
		
		return alumno; 
	}

}
