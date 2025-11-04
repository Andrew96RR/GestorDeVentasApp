package com.Hokkaido.GestorDeVentasApp.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Hokkaido.GestorDeVentasApp.entidades.Inventories;
import com.Hokkaido.GestorDeVentasApp.repositorios.InventoriesRepositorio;

@Service
public class InventoriesServicioImpl implements InventoriesServicio {

	@Autowired
	private InventoriesRepositorio inventoriesRepositorio;
	
	@Override
	public List<Inventories> getAllInventories() {
		
		return inventoriesRepositorio.findAll();
	}

}
