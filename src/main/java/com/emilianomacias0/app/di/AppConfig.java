package com.emilianomacias0.app.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.emilianomacias0.app.di.models.servicios.IServicio;
import com.emilianomacias0.app.di.models.servicios.MiServicio;
import com.emilianomacias0.app.di.models.servicios.MiServicioComplejo;

@Configuration
public class AppConfig {

	@Bean("miservicioprincipal")
	public IServicio registrasMiServicio() {
		return new MiServicio();
	}
	
	@Bean("miserviciocomplejo")
//	@Primary
	public IServicio registrasMiServicioComplejo() {
		return new MiServicioComplejo();
	}
}
