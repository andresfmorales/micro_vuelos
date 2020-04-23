package com.mitocode.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.mitocode.model.Persona;

public interface IPersonaRepo  extends JpaRepository<Persona, Integer> {

	@Query(
			  value = "Select * from persona where vuelo_id_vuelo = :id", 
			  nativeQuery = true)
			List<Persona> pasajeros( @Param("id") Integer id);
}
