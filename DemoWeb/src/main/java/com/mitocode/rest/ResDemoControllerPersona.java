package com.mitocode.rest;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mitocode.model.Persona;
import com.mitocode.repo.IPersonaRepo;

@RestController
@RequestMapping("/personas")
public class ResDemoControllerPersona {

	@Autowired
	private IPersonaRepo repo;

	@GetMapping(path = "/listar")
	public List<Persona> listar() {
		return repo.findAll();
	}

	@PostMapping(path = "/agregar")
	public void insertar(@RequestBody Persona per) {

		repo.save(per);
	}

	@PutMapping(path = "/modificar")
	public void modificar(@RequestBody Persona per) { // Requestbody sirve para que java lea el json que se crea en en postman
														
		repo.save(per);
	}

	@DeleteMapping(value = "/{id}")
	public void eliminar(@PathVariable("id") Integer id) {
		repo.deleteById(id);
	}	

	@PersistenceContext
	EntityManager entityManager;

	@GetMapping(value = "/buscarId/{id}")
	public Optional<Persona> buscar(@PathVariable("id") Integer id_persona) {
		return repo.findById(id_persona);
	}
}
