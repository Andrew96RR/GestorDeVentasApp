package com.Hokkaido.GestorDeVentasApp.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.Hokkaido.GestorDeVentasApp.entidades.Suppliers;
import com.Hokkaido.GestorDeVentasApp.servicios.SuppliersServicio;

@Controller
public class SuppliersController {
	@Autowired
	private SuppliersServicio suppliersServicio;
	
	@GetMapping("/listSuppl")
	private String getAllAssistants (Model model){
		try {
			List<Suppliers> lisSuppliers = suppliersServicio.gitAllSuppliers();
			model.addAttribute("Suppliers", lisSuppliers);
		} catch (Exception e) {
			System.out.println("Error: "+e);
		}
		return "/entities/supplier/Suppliers";
	}

}
