package com.Hokkaido.GestorDeVentasApp.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.Hokkaido.GestorDeVentasApp.entidades.Orders;
import com.Hokkaido.GestorDeVentasApp.servicios.OrdensServicio;

@Controller
public class OrdersController {
	
	@Autowired
	private OrdensServicio ordensServicio;
	
	@GetMapping("/listOrders")
	public String getAllAssistants(Model model) {
		try {
			List<Orders> lisOrders = ordensServicio.getAllOrders();
			model.addAttribute("Orders", lisOrders);
		} catch (Exception e) {
			System.out.println("Error: "+e);
		}
		return "/entities/order/Orders";
	}

}
