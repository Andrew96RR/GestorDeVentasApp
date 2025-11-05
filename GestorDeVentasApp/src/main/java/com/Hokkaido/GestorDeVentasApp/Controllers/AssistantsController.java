package com.Hokkaido.GestorDeVentasApp.Controllers;

import java.util.List;
import com.Hokkaido.GestorDeVentasApp.servicios.AssistansServicio;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.Hokkaido.GestorDeVentasApp.entidades.Assistants;

@Controller
public class AssistantsController {
	
	@Autowired
	private AssistansServicio assistansServicio;
	
	@GetMapping("/listAssist")
	public String getAllAssistants(Model model) {
		try {
			List<Assistants> listAssistants = assistansServicio.GetAllAssistants();
			model.addAttribute("Assistants", listAssistants);
		}
		catch(Exception e) {
			System.out.println("Error: "+e);
		}
		return "/entities/assist/Assistants";
	}
	
	@DeleteMapping("/delAssist/{id}")
	public ResponseEntity<?>  deleteAssistant(@PathVariable("id") Long id) {
		try {
	        assistansServicio.delAssistant(id);
	        return ResponseEntity.ok().build(); // return 200 OK
	    } catch (Exception e) {
	        e.printStackTrace(); // show in logs
	        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
	                .body("Error deleting assistant: " + e.getMessage());
	    }
	
	}

}
