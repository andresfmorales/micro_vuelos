package com.mitocode.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mitocode.model.Vuelo;
import com.mitocode.repo.IVueloRepo;

@RestController
@RequestMapping("/vuelos")
public class ResDemoControllerVuelo {

	@Autowired
	private IVueloRepo repo;
	
	@GetMapping(path ="/listar")
	public List<Vuelo> listar() {
		return repo.findAll();
	}
}
