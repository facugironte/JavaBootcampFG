package com.educacionit.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educacionit.beans.EjemploBean;
import com.educacionit.service.BeanService;

@Service
public class BeanServiceImpl implements BeanService {

	@Autowired
	private EjemploBean ejemploBean1;
	
	@Autowired
	private EjemploBean ejemploBean2;
	
	public BeanServiceImpl() {
		System.out.println("Capa service. constructor: 1: "+ ejemploBean1);
		System.out.println("Capa service. constructor: 2: "+ ejemploBean2);
		
	}
	
	@Override
	public void ImprimirBean() {
		System.out.println("Capa service. imprimirBean: 1: "+ ejemploBean1.getCurrentTimestamp());
		System.out.println("Capa service. imprimirBean: 2: "+ ejemploBean2.getCurrentTimestamp());
		
	}

}
