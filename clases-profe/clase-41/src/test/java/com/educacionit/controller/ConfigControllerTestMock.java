package com.educacionit.controller;

import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.educacionit.config.Configuracion;

@ExtendWith(MockitoExtension.class)
class ConfigControllerTestMock {
	
	@Mock
	private Configuracion mockConfig;
	
	@InjectMocks
	private ConfigController configController;
	
	@Test
	void testGetConfig() {
		//CONFIGS SET
		when(mockConfig.getNombre1()).thenReturn("VARIABLE_1"); 
		when(mockConfig.getNombre2()).thenReturn("VARIABLE_2");
		when(mockConfig.getPropiedad1()).thenReturn("PROPIEDAD_1");
		when(mockConfig.getPropiedad2()).thenReturn("PROPIEDAD_2");
		
		//METODOS CONTROLLER
		
		MockMvc mockMvc = MockMvcBuilders.standaloneSetup(configController).build();
		
		try {
			mockMvc.perform(MockMvcRequestBuilders.get("/configuracion/propiedades")) //requiere un request builder
			.andExpect(MockMvcResultMatchers.status().isOk())
			.andExpect(MockMvcResultMatchers.view().name("mostrar-propiedades"))
			.andExpect(MockMvcResultMatchers.model().attribute("nombre1", "VARIABLE_1"))
			.andExpect(MockMvcResultMatchers.model().attribute("nombre2", "VARIABLE_2"))
			.andExpect(MockMvcResultMatchers.model().attribute("propiedad1", "PROPIEDAD_1"))
			.andExpect(MockMvcResultMatchers.model().attribute("propiedad2", "PROPIEDAD_2"));
		} catch (Exception ex) {
			
		}
	}

}
