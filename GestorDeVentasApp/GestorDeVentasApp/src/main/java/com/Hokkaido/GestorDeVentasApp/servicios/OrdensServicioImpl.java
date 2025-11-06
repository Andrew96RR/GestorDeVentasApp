package com.Hokkaido.GestorDeVentasApp.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Hokkaido.GestorDeVentasApp.entidades.Orders;
import com.Hokkaido.GestorDeVentasApp.repositorios.OrdesRepositorio;

@Service
public class OrdensServicioImpl implements OrdensServicio {
	
	@Autowired
	private OrdesRepositorio ordesRepositorio;
	
	@Override
	public List<Orders> getAllOrders(){		
		return ordesRepositorio.findAll();
	}

}
