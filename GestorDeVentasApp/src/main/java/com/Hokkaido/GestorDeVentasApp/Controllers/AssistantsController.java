package com.Hokkaido.GestorDeVentasApp.Controllers;

import java.util.List;
import com.Hokkaido.GestorDeVentasApp.servicios.AssistansServicio;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.Hokkaido.GestorDeVentasApp.entidades.Assistants;

@Controller
public class AssistantsController {
	
	@Autowired
	private AssistansServicio assistansServicio;
	
	@GetMapping("/listAssist")
	public String getAllAssistants(Model model) {
		try {
			List<Assistants> listAssistants = assistansServicio.GetAllAssistants();
			model.addAttribute("Assistants", listAssistants);
		}
		catch(Exception e) {
			System.out.println("Error: "+e);
		}
		return "/entities/assist/Assistants";
	}
	
	@DeleteMapping("/delAssist/{id}")
	public ResponseEntity<?>  deleteAssistant(@PathVariable("id") Long id) {
		try {
	        assistansServicio.delAssistant(id);
	        return ResponseEntity.ok().build(); // return 200 OK
	    } catch (Exception e) {
	        e.printStackTrace(); // show in logs
	        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
	                .body("Error deleting assistant: " + e.getMessage());
	    }
	
	}
	
	@GetMapping("/addAssist")
	public String showAddForn(Model model) {
		try {
			model.addAttribute("assistant", new Assistants());
		} catch (Exception e) {
			System.out.println("Error preparing add form: " + e.getMessage());
		}
		return "/entities/assist/AddAssist";
	}
	
    @GetMapping("/editAssist/{id}")
    public String showEditForm(@PathVariable("id") Long id, Model model) {
        try {       
 
            Assistants assistant = assistansServicio.getAssistantById(id);            
            model.addAttribute("assistant", assistant);
        } catch (Exception e) {
            System.out.println("Error getting editing wizard: " + e.getMessage());
            return "redirect:/listAssist";
        }
        return "/entities/assist/EditAssist";
    }

    @PostMapping("/saveAssist")
    public String saveAssistant(@ModelAttribute("assistant") Assistants assistant, RedirectAttributes redirectAttributes) {
 
        boolean isNew = (assistant.getAssistant_id() == null); 
        try {
            assistansServicio.saveOrUpdateAssistant(assistant);
            if (isNew) {
                redirectAttributes.addFlashAttribute("successMessage", "Successfully added assistant.");
            } else {
                redirectAttributes.addFlashAttribute("successMessage", "Successfully updated wizard.");
            }
        } catch (Exception e) {
            redirectAttributes.addFlashAttribute("errorMessage", "Error saving wizard: " + e.getMessage());
        }
        
        return "redirect:/listAssist";
    }

    @GetMapping("/delAssist/{id}")
    public String deleteAssistant(@PathVariable("id") Long id, RedirectAttributes redirectAttributes) {
        try {
            assistansServicio.deleteAssistant(id);
            redirectAttributes.addFlashAttribute("successMessage", "assistant ID " + id + " successfully removed.");
        } catch (Exception e) {
            redirectAttributes.addFlashAttribute("errorMessage", "Error deleting assistant ID " + id + ": " + e.getMessage());
        }
        
        return "redirect:/listAssist";
    }
	
	

}
