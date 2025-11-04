package com.Hokkaido.GestorDeVentasApp.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.Hokkaido.GestorDeVentasApp.entidades.Branches;
import com.Hokkaido.GestorDeVentasApp.servicios.BranchesServicio;


@Controller
public class BranchesController {
	
	@Autowired
	private BranchesServicio branchesServicio;
	
	@GetMapping("/listBranch")
	public String getAllAssistants(Model model) {
		try {
			List<Branches> listBranches = branchesServicio.getAllBranches();
			model.addAttribute("branches", listBranches);
		}
		catch(Exception e) {
			System.out.println("Error: "+e);
		}
		return "/entities/assist/Assistants";
	}
}
