package com.emilianomacias0.app.di.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.emilianomacias0.app.di.models.servicios.IServicio;

@Controller
public class IndexController {

	//Por medio de inyeccion
	@Autowired
	@Qualifier("miserviciocomplejo")
	private IServicio servicio;
	
	//Desde el contructor
	/*@Autowired
	public IndexController(IServicio servicio) {
		this.servicio = servicio;
	}*/

	@GetMapping({"","/","/index"})
	public String index(Model model) {
		model.addAttribute("objeto", servicio.proceso());
		return "index";
	}

	//Por medio del setter
	/*@Autowired
	public void setServicio(IServicio servicio) {
		this.servicio = servicio;
	}*/
	
	
}
