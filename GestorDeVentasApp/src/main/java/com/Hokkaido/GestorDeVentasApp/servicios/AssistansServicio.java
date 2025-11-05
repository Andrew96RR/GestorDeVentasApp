package com.Hokkaido.GestorDeVentasApp.servicios;

import java.util.List;

import com.Hokkaido.GestorDeVentasApp.entidades.Assistants;

public interface AssistansServicio {
	List<Assistants> GetAllAssistants();
	
	void delAssistant(Long id);

}
