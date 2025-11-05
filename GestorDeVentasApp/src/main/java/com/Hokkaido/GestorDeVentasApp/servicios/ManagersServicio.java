package com.Hokkaido.GestorDeVentasApp.servicios;

import java.util.List;

import com.Hokkaido.GestorDeVentasApp.entidades.Managers;

public interface ManagersServicio {
	
	List<Managers> getAllManagers();
	void delManager(Long id);

}
