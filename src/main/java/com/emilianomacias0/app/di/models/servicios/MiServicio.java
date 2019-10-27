package com.emilianomacias0.app.di.models.servicios;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("miserviciosimple")
@Primary
public class MiServicio  implements IServicio {

	public String proceso(){
		return "proceso importante";
	}
}
