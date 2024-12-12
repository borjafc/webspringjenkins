package com.arquitecturajava.webspring;

public class Persona {
	private String nombre;

	public Persona(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public Persona() {
		super();
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
