	package com.mitocode.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.ForeignKey;

@Entity
public class Persona { //Esta clase hace referencia a las tablas de la base de datos

	@Id
	private int id_persona;
	
	@Column(name="identificacion", length = 12)
	private String identificacion;
	
	@Column(name="nombre", length = 30)
	private String nombre;
	
	@Column(name="direccion", length = 20)
	private String direccion;
	
	@Column(name="edad")
	private int edad;
	
	@Column(name="numero_asiento")
	private int numero_asiento;
	
	@Column(name="vuelo_id_vuelo")
		private int vuelo_id_vuelo;

	public int getId_persona() {
		return id_persona;
	}

	public void setId_persona(int id_persona) {
		this.id_persona = id_persona;
	}

	public String getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getNumero_asiento() {
		return numero_asiento;
	}

	public void setNumero_asiento(int numero_asiento) {
		this.numero_asiento = numero_asiento;
	}

	public int getVuelo_id_vuelo() {
		return vuelo_id_vuelo;
	}

	public void setVuelo_id_vuelo(int vuelo_id_vuelo) {
		this.vuelo_id_vuelo = vuelo_id_vuelo;
	}


			
}

