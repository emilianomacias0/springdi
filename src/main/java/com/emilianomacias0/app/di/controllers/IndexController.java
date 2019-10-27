package com.emilianomacias0.app.di.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.emilianomacias0.app.di.models.servicios.MiServicio;

@Controller
public class IndexController {

	@Autowired
	private MiServicio servicio;
	@GetMapping({"","/","/index"})
	public String index(Model model) {
		model.addAttribute("objeto", servicio.proceso());
		return "index";
	}
}
