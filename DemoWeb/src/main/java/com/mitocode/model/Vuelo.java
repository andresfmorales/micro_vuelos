package com.mitocode.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Vuelo { //Esta clase hace referencia a las tablas de la base de datos

	@Id
	private int idVuelo;
	
	@Column(name="aerolinea", length = 12)
	private String aerolinea;
	
	@Column(name="pasajeros")
	private int pasajeros;
	
	@Column(name="ciudad", length = 20)
	private String ciudad;
	
	@Column(name="fecha_salida")
	private Date fecha_salida;
		
	@Column(name="fecha_llegada")
	private Date fecha_llegada;

	public int getIdVuelo() {
		return idVuelo;
	}

	public void setIdVuelo(int idVuelo) {
		this.idVuelo = idVuelo;
	}

	public String getAelolinea() {
		return aerolinea;
	}

	public void setAerolinea(String aerolinea) {
		this.aerolinea = aerolinea;
	}

	public int getPasajeros() {
		return pasajeros;
	}

	public void setPasajeros(int pasajeros) {
		this.pasajeros = pasajeros;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public Date getFecha_salida() {
		return fecha_salida;
	}

	public void setFecha_salida(Date fecha_salida) {
		this.fecha_salida = fecha_salida;
	}

	public Date getFecha_llegada() {
		return fecha_llegada;
	}

	public void setFecha_llegada(Date fecha_llegada) {
		this.fecha_llegada = fecha_llegada;
	}
	
	
}

