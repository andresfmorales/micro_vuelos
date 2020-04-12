package com.mitocode.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.mitocode.model.Vuelo;
import com.mitocode.repo.IVueloRepo;

@RestController
@RequestMapping("/vuelos")
public class ResDemoController {

	@Autowired
	private IVueloRepo repo;
	
	@GetMapping(path ="/listar")
	public List<Vuelo> listar() {
		return repo.findAll();
	}
	
}
