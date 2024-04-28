package com.educacionit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.educacionit.service.BeanService;

@Controller
@RequestMapping("/bean")
public class BeanController{
	
	@Autowired 
	private BeanService beanService;
	
	@GetMapping("/ejemplo")
	public void mostrarBeans() {
		beanService.ImprimirBean();
	}

}
