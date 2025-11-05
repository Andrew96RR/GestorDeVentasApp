package com.Hokkaido.GestorDeVentasApp.servicios;

import java.util.List;

import com.Hokkaido.GestorDeVentasApp.entidades.Branches;

public interface BranchesServicio {

	List<Branches> getAllBranches();
	
	void delBranch(Long id);
	
}
