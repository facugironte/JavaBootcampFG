package com.educacionit.controller;


import static org.assertj.core.api.Assertions.fail;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@AutoConfigureMockMvc
class ConfigControllerTest {
	
	@Autowired
	private MockMvc mockMvc;
	
	@Test
	void testGetConfig() {
		
		try {
			mockMvc.perform(MockMvcRequestBuilders.get("/configuracion/propiedades")) //requiere un request builder
			.andExpect(MockMvcResultMatchers.status().isOk())
			.andExpect(MockMvcResultMatchers.view().name("mostrar-propiedades"))
			.andExpect(MockMvcResultMatchers.model().attribute("nombre1", "este es el valor de nombre1"))
			.andExpect(MockMvcResultMatchers.model().attribute("nombre2", "este es el valor de nombre2"))
			.andExpect(MockMvcResultMatchers.model().attribute("propiedad1", "23"))
			.andExpect(MockMvcResultMatchers.model().attribute("propiedad2", "Valor de la propiedad 2"));
		} catch (Exception ex) {
			
		}
	}

}
