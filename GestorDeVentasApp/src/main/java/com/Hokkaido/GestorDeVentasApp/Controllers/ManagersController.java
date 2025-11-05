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

import com.Hokkaido.GestorDeVentasApp.entidades.Managers;
import com.Hokkaido.GestorDeVentasApp.servicios.ManagersServicio;

@Controller
public class ManagersController {
	
	@Autowired
	private ManagersServicio managersServicio;
	
	@GetMapping("/listManager")
	public String getAllManagers(Model model) {
		try {
			List<Managers> listManagers = managersServicio.getAllManagers();
			model.addAttribute("managers", listManagers);
		}
		catch(Exception e) {
			System.out.println("Error: "+e);
		}
		return "/entities/manager/Managers";
	}
	
	@DeleteMapping("/delManager/{id}")
	public ResponseEntity<?> deleteManager(@PathVariable("id") Long id) {
		try {
			managersServicio.delManager(id);
	        return ResponseEntity.ok().build(); // return 200 OK
	    } catch (Exception e) {
	        e.printStackTrace(); // show in logs
	        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
	                .body("Error deleting assistant: " + e.getMessage());
	    }
	
	}
	
	

}
