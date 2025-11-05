package com.Hokkaido.GestorDeVentasApp.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Hokkaido.GestorDeVentasApp.entidades.Managers;
import com.Hokkaido.GestorDeVentasApp.repositorios.ManagersRepositorio;

@Service
public class ManagersServicioImpl implements ManagersServicio{
	
	@Autowired
	private ManagersRepositorio managersRepositorio;

	@Override
	public List<Managers> getAllManagers() {
		return managersRepositorio.findAll();
	}

	@Override
	public void delManager(Long id) {
		managersRepositorio.deleteById(id);
	}
	

}
