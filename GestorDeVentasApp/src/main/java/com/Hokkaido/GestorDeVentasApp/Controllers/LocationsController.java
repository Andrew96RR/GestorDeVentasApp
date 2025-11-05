package com.Hokkaido.GestorDeVentasApp.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.Hokkaido.GestorDeVentasApp.entidades.Locations;
import com.Hokkaido.GestorDeVentasApp.servicios.LocationsServicio;

@Controller
public class LocationsController {
	
	@Autowired
	private LocationsServicio locationsServicio;
	
	@GetMapping("/listLocation")
	public String getAllLocations(Model model) {
		try {
			List<Locations> listLocations = locationsServicio.getAllLocations();
			model.addAttribute("locations", listLocations);
		}
		catch(Exception e) {
			System.out.println("Error: "+e);
		}
		return "/entities/location/Locations";
	}
	
	@DeleteMapping("/delLocation/{id}")
	public ResponseEntity<?> deleteLocation(@PathVariable("id") Long id) {
		try {
			locationsServicio.delLocation(id);
	        return ResponseEntity.ok().build(); // return 200 OK
	    } catch (Exception e) {
	        e.printStackTrace(); // show in logs
	        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
	                .body("Error deleting assistant: " + e.getMessage());
	    }
	
	}

}
