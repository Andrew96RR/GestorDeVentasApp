package com.Hokkaido.GestorDeVentasApp.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.Hokkaido.GestorDeVentasApp.entidades.Inventories;
import com.Hokkaido.GestorDeVentasApp.servicios.InventoriesServicio;

public class InventoriesController {
	
	@Autowired
	private InventoriesServicio inventoriesServicio;
	
	@GetMapping("/listInventory")
	public String getAllAssistants(Model model) {
		try {
			List<Inventories> listInventories = inventoriesServicio.getAllInventories();
			model.addAttribute("inventories", listInventories);
		}
		catch(Exception e) {
			System.out.println("Error: "+e);
		}
		return "/entities/inventory/Inventories";
	}

}
