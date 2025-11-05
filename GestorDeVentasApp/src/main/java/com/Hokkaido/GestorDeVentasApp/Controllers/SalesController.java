package com.Hokkaido.GestorDeVentasApp.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.Hokkaido.GestorDeVentasApp.entidades.Sales;
import com.Hokkaido.GestorDeVentasApp.servicios.SalesServicio;

@Controller
public class SalesController {
	
	@Autowired
	private SalesServicio salesServicio;
	
	@GetMapping("/listSales")
	private String getAllAssistants(Model model) {
		try {
			List<Sales> lisSales = salesServicio.gitAllsales();
			model.addAttribute("sales", lisSales);
		} catch (Exception e) {
			System.out.println("Error: "+e);
		}
		return "/entities/sale/Sales";
	}

}
