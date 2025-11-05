package com.Hokkaido.GestorDeVentasApp.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Hokkaido.GestorDeVentasApp.entidades.Branches;
import com.Hokkaido.GestorDeVentasApp.repositorios.BranchesRepositorio;

@Service
public class BranchesServicioImpl implements BranchesServicio{

	@Autowired
	private BranchesRepositorio branchesRepositorio ;
	
	@Override
	public List<Branches> getAllBranches() {
		return branchesRepositorio.findAll();
	}

	@Override
	public void delBranch(Long id) {
		branchesRepositorio.deleteById(id);
	}

}
