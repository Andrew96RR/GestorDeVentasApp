package com.Hokkaido.GestorDeVentasApp.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Hokkaido.GestorDeVentasApp.entidades.Locations;
import com.Hokkaido.GestorDeVentasApp.repositorios.LocationsRepositorio;

@Service
public class LocationsServicioImpl implements LocationsServicio{
	
	@Autowired
	private LocationsRepositorio locationsRepositorio;
	
	@Override
	public List<Locations> getAllLocations() {
		return locationsRepositorio.findAll();
	}
	

}
