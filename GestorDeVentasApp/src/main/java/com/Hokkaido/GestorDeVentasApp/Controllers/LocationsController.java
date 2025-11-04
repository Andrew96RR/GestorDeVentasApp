package com.Hokkaido.GestorDeVentasApp.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.Hokkaido.GestorDeVentasApp.entidades.Locations;
import com.Hokkaido.GestorDeVentasApp.servicios.LocationsServicio;

public class LocationsController {
	
	@Autowired
	private LocationsServicio locationsServicio;
	
	@GetMapping("/listLocation")
	public String getAllAssistants(Model model) {
		try {
			List<Locations> listLocations = locationsServicio.getAllLocations();
			model.addAttribute("locations", listLocations);
		}
		catch(Exception e) {
			System.out.println("Error: "+e);
		}
		return "/entities/location/Locations";
	}

}
