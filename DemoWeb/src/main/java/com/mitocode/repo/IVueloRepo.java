package com.mitocode.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mitocode.model.Vuelo;

public interface IVueloRepo extends JpaRepository<Vuelo, Integer>{ //Clase, llave primaria

	
	//ACA van los @query para las consultas sql
}
