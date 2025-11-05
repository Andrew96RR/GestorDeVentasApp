package com.Hokkaido.GestorDeVentasApp.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.Hokkaido.GestorDeVentasApp.entidades.Inventories;
import com.Hokkaido.GestorDeVentasApp.servicios.InventoriesServicio;

@Controller
public class InventoriesController {
	
	@Autowired
	private InventoriesServicio inventoriesServicio;
	
	@GetMapping("/listInventory")
	public String getAllInventories(Model model) {
		try {
			List<Inventories> listInventories = inventoriesServicio.getAllInventories();
			model.addAttribute("Inventories", listInventories);
		}
		catch(Exception e) {
			System.out.println("Error: "+e);
		}
		return "/entities/inventory/Inventories";
	}
	
	@DeleteMapping("/delInventory/{id}")
	public ResponseEntity<?> deleteInventory(@PathVariable("id") Long id) {
		try {
			inventoriesServicio.delInventory(id);
	        return ResponseEntity.ok().build(); // return 200 OK
	    } catch (Exception e) {
	        e.printStackTrace(); // show in logs
	        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
	                .body("Error deleting assistant: " + e.getMessage());
	    }
	
	}

}
