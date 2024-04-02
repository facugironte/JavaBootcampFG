package com.educacionit;

public class Ciudad {
	
	private int id;
	private String desc;
	private int id_pais;
	
	public Ciudad(int id_, String desc_, int id_pais_) {
		this.id = id_;
		this.desc = desc_;
		this.id_pais = id_pais_;
	}
	
	public String getDesc() {
		return this.desc;
	}
	
	

}
