package com.Hokkaido.GestorDeVentasApp.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.Hokkaido.GestorDeVentasApp.entidades.Products;
import com.Hokkaido.GestorDeVentasApp.servicios.ProductsServicio;

@Controller
public class ProductsController {
	
	@Autowired
	private ProductsServicio productsServicio;
	
	@GetMapping("/listProduc")
	public String getAllAssistants(Model model) {
		try {
			List<Products> lisproducts=productsServicio.getAllProducts();
			model.addAttribute("Products", lisproducts);
		} catch (Exception e) {
			System.out.println("Error: "+e);
		}
		return "/entities/product/Products";
	}

}
