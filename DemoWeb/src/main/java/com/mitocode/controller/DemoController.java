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
	private IPersonaRepo repo;

	
	@GetMapping("/greeting")
	public String greeting(@RequestParam(
			name="name", required=false, defaultValue="World") String name, Model model) {
		//logica
			Persona per = new Persona();
			per.setIdentificacion("2");
			per.setNombre("andres");
			per.setDireccion("casa2");
			per.setEdad(24);
			per.setNumero_asiento(21);
			per.setVuelo_id_vuelo(1);
			repo.save(per); 	
				
		model.addAttribute("name", name);
		return "greeting"; //nombre de archivo
	}
	
	@GetMapping("/listar")
	public String greeting(Model model) {
		//logica	
		model.addAttribute("personas", repo.findAll());
		return "listar"; //nombre de archivo
	}

}
