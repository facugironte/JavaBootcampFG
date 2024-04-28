package com.educacionit.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("singleton") //es la default, no hace falta colocarla - unica instancia por bean
@Scope("prototype")

public class EjemploBean {

	private Long currentTimestamp;

	public EjemploBean() {
		super();
		this.currentTimestamp = System.currentTimeMillis();
		System.out.println("Soy el Constructor bean: " + this.currentTimestamp);
	}

	public Long getCurrentTimestamp() {
		return currentTimestamp;
	}

	public void setCurrentTimestamp(Long currentTimestamp) {
		this.currentTimestamp = currentTimestamp;
	}
	
	
	
}
