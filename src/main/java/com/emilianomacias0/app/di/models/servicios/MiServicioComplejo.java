package com.emilianomacias0.app.di.models.servicios;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Component("miserviciocomplejo")
//@Primary
public class MiServicioComplejo implements IServicio{

	@Override
	public String proceso() {
		return "Ejecutando un proceso complejo";
	}

}
