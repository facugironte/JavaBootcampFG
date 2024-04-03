package com.educacionit;

public class Ciudad {
	
	private String desc;
	private int id_pais;
	
	public Ciudad(String desc_, int id_pais_) {
		this.desc = desc_;
		this.id_pais = id_pais_;
	}
	
	public String getDesc() {
		return this.desc;
	}

	public int getIdPais() {
		return this.id_pais;
	}
	
	

}
