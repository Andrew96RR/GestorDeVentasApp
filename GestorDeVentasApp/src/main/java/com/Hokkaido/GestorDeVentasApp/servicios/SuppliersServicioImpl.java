package com.Hokkaido.GestorDeVentasApp.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Hokkaido.GestorDeVentasApp.entidades.Suppliers;
import com.Hokkaido.GestorDeVentasApp.repositorios.SuppliersRepositorio;

@Service
public class SuppliersServicioImpl implements SuppliersServicio{
	@Autowired
	private SuppliersRepositorio suppliersRepositorio;
	
	@Override
	public List<Suppliers> gitAllSuppliers(){
		return suppliersRepositorio.findAll();
	}
	

}
