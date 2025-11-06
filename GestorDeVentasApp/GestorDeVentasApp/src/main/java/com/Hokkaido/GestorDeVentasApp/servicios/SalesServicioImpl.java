package com.Hokkaido.GestorDeVentasApp.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Hokkaido.GestorDeVentasApp.entidades.Sales;
import com.Hokkaido.GestorDeVentasApp.repositorios.SalesRepositorio;

@Service
public class SalesServicioImpl implements SalesServicio{
	
	@Autowired
	private SalesRepositorio salesRepositorio;
	
	@Override
	public List<Sales> gitAllsales(){
		return salesRepositorio.findAll();
	}
	

}
