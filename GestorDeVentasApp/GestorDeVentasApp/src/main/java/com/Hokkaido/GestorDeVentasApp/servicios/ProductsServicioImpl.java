package com.Hokkaido.GestorDeVentasApp.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Hokkaido.GestorDeVentasApp.entidades.Products;
import com.Hokkaido.GestorDeVentasApp.repositorios.ProductsRepositorio;

@Service
public class ProductsServicioImpl implements ProductsServicio{
	
	@Autowired
	private ProductsRepositorio productsRepositorio;
	
	@Override
	public List<Products> getAllProducts(){
		return productsRepositorio.findAll();
	}
	

}
