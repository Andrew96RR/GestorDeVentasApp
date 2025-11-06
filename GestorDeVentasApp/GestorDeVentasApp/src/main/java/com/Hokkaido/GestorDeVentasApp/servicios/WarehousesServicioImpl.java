package com.Hokkaido.GestorDeVentasApp.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Hokkaido.GestorDeVentasApp.entidades.Warehouses;
import com.Hokkaido.GestorDeVentasApp.repositorios.WarehousesRepositorio;

@Service
public class WarehousesServicioImpl implements WarehousesServicio{
	
	@Autowired
	private WarehousesRepositorio warehousesRepositorio;
	
	@Override
	public List<Warehouses> gitAllWarehouses(){
		return warehousesRepositorio.findAll();
	}
	

}
