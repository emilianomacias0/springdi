package com.emilianomacias0.app.di;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.emilianomacias0.app.di.models.domain.ItemFactura;
import com.emilianomacias0.app.di.models.domain.Producto;
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
	
	@Bean("itemsFactura")
	public List<ItemFactura> registrarItems(){
		Producto producto1 = new Producto("Camara sony", 100);
		Producto producto2 = new Producto("Bicicleta treck aro 26", 200);
		
		ItemFactura linea1 = new ItemFactura(producto1, 2);
		ItemFactura linea2 = new ItemFactura(producto2, 1);
		
		return Arrays.asList(linea1,linea2);
	}
}
