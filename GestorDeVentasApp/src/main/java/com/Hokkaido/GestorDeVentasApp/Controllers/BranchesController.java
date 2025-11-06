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
			model.addAttribute("Branches", listBranches);
		}
		catch(Exception e) {
			System.out.println("Error: "+e);
		}
		return "/entities/branch/Branches";
	}
	
	@DeleteMapping("/delBranch/{id}")
	public ResponseEntity<?> deleteBranch(@PathVariable("id") Long id) {
		try {
			branchesServicio.delBranch(id);
	        return ResponseEntity.ok().build(); // return 200 OK
	    } catch (Exception e) {
	        e.printStackTrace(); // show in logs
	        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
	                .body("Error deleting assistant: " + e.getMessage());
	    }
	
	}
	
	
}
