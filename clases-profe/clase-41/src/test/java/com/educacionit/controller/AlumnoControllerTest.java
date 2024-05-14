package com.educacionit.controller;

import static org.assertj.core.api.Assertions.fail;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.educacionit.model.Alumno;
import com.educacionit.service.AlumnoService;

@ExtendWith(MockitoExtension.class)
class AlumnoControllerTest {
	
	private MockMvc mockMvc;
	
	private List<Alumno> alumnos = new ArrayList<>();
	
	@Mock
	private AlumnoService alumnoService;
	
	@InjectMocks
	private AlumnoController alumnoController;
	
	
	@BeforeEach
	public void setUp() {
		mockMvc = MockMvcBuilders.standaloneSetup(alumnoController).build();
		
		alumnos.add(new Alumno(1, "nombre", 30));
		alumnos.add(new Alumno(2, "nombre2", 40));
	}
	
	
	@Test
	void testGetAllAlumnos() {
		
		
		when(alumnoService.getAllAlumnos()).thenReturn(alumnos);
		
		try {			
			mockMvc.perform(get("/alumnos"))
			.andExpect(status().isOk())
			.andExpect(content().contentType(MediaType.APPLICATION_JSON))
			.andExpect(jsonPath("$[0].legajo").value(1))
			.andExpect(jsonPath("$[0].nombre").value("nombre"))
			.andExpect(jsonPath("$[0].edad").value(30))
			.andExpect(jsonPath("$[1].legajo").value(2))
			.andExpect(jsonPath("$[1].nombre").value("nombre2"))
			.andExpect(jsonPath("$[1].edad").value(40));
		} catch(Exception ex) {
			fail("Se produjo un error llamando a getAllAlumnos");
		}
	}
	
	@Test 
	void testGetAlumnoById(){
		//otra forma... en vez de mock llamamos al alumno controller
		//aca deje de copiar... clase 45!
		Alumno alumno = new Alumno(1000, "nombre", 30);
		
	}

}
