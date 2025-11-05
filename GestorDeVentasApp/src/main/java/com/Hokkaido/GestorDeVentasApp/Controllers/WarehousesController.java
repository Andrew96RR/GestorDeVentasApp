package com.Hokkaido.GestorDeVentasApp.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.Hokkaido.GestorDeVentasApp.entidades.Warehouses;
import com.Hokkaido.GestorDeVentasApp.servicios.WarehousesServicio;

@Controller
public class WarehousesController {
	@Autowired
	private WarehousesServicio warehousesServicio;
	
	@GetMapping("/listWareho")
	public String getAllAssistants (Model model) {
		try {
			List<Warehouses> listWarehouses = warehousesServicio.gitAllWarehouses();
			model.addAttribute("warehouses", listWarehouses);
		} catch (Exception e) {
			System.out.println("Error: "+e);
		}
		return "/entities/warehouse/Warehouses";
	}

}
