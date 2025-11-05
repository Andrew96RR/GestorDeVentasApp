package com.Hokkaido.GestorDeVentasApp.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.Hokkaido.GestorDeVentasApp.entidades.Managers;
import com.Hokkaido.GestorDeVentasApp.servicios.ManagersServicio;

@Controller
public class ManagersController {
	
	@Autowired
	private ManagersServicio managersServicio;
	
	@GetMapping("/listManager")
	public String getAllAssistants(Model model) {
		try {
			List<Managers> listManagers = managersServicio.getAllManagers();
			model.addAttribute("managers", listManagers);
		}
		catch(Exception e) {
			System.out.println("Error: "+e);
		}
		return "/entities/manager/Managers";
	}
	
	

}
