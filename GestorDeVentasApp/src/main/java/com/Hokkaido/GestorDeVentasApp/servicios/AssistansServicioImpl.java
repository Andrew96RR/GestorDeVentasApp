package com.Hokkaido.GestorDeVentasApp.servicios;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Hokkaido.GestorDeVentasApp.entidades.Assistants;
import com.Hokkaido.GestorDeVentasApp.repositorios.AssistansRepositorio;

@Service
public class AssistansServicioImpl implements AssistansServicio {

	

	@Autowired
	private AssistansRepositorio assistansRepositorio ;
	
	@Override
	public List<Assistants> GetAllAssistants() {
		
		return assistansRepositorio.findAll();
	}
	
	@Override
	public void delAssistant(Long id) {
		assistansRepositorio.deleteById(id);
	}

	@Override
	public Assistants getAssistantById(Long id) {
		Optional<Assistants> optionalAssistant = assistansRepositorio.findById(id);
		if (optionalAssistant.isPresent()) {
			return optionalAssistant.get();
		} else {
			throw new RuntimeException("Wizard not found with ID: " + id);
		}
	}

    @Override
	public void saveOrUpdateAssistant(Assistants assistant) {
    	assistansRepositorio.save(assistant);
	}

    @Override
	public void deleteAssistant(Long id) {
    	assistansRepositorio.deleteById(id);
	}

}
