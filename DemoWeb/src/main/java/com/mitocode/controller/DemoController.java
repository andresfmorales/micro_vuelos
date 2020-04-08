package com.mitocode.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mitocode.model.Persona;
import com.mitocode.model.Vuelo;
import com.mitocode.repo.IPersonaRepo;
import com.mitocode.repo.IVueloRepo;

@Controller
public class DemoController {
	
	@Autowired
	private IVueloRepo repo;

	
	@GetMapping("/greeting")
	public String greeting(@RequestParam(
			name="name", required=false, defaultValue="World") String name, Model model) {
		//logica
			Vuelo v = new Vuelo();
			v.setIdVuelo(4);
			v.setPasajeros(199);
			v.setAerolinea("Emirates");
			v.setCiudad("Bogota");
			//v.getFecha_salida("2020-06-04");
			//v.setFecha_llegada("2020-06-04");
			repo.save(v);
				
		model.addAttribute("name", name);
		return "greeting"; //nombre de archivo
	}
	
	@GetMapping("/listar")
	public String greeting(Model model) {
		//logica	
		model.addAttribute("vuelos", repo.findAll());
		return "listar"; //nombre de archivo
	}

}
