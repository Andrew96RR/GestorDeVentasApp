package com.Hokkaido.GestorDeVentasApp.servicios;

import java.util.List;

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

}
