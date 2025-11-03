package com.Hokkaido.GestorDeVentasApp.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Hokkaido.GestorDeVentasApp.entidades.Assistants;

@RestController
public class AssistantsController {
	
	@Autowired
	private AssistantsController assistantsController;
	
	@GetMapping("")
	public String getAllAssistants(Model model) {
		List<Assistants> assistants = assistantsController.GetAllAssistants();
		
		return null;	
	}

}
