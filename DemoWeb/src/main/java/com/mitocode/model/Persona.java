package com.mitocode.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Persona { //Esta clase hace referencia a las tablas de la base de datos

	@Id
	private int idPersona;
	/*
	@Column(name="cedula", length = 12)
	private String cedula;
	*/
	@Column(name="nombre", length = 30)
	private String nombre;
	/*@Column(name="direccion", length = 20)
	private String direccion;
	@Column(name="edad")
	private int edad;
	@Column(name="numero_asiento")
	private int numero_asiento;
	*/
	
	public int getIdPersona() {
		return idPersona;
	}
	
	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}
	/*public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	*/
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/*public String getDireccion() {
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
	*/
	
}

