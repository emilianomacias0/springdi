package com.emilianomacias0.app.di.models.servicios;

import org.springframework.stereotype.Component;

@Component
public class MiServicio  implements IServicio {

	public String proceso(){
		return "proceso importante";
	}
}
