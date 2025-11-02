package com.Hokkaido.GestorDeVentasApp.entidades;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Inventories {
	
	@Id
	private Long inventory_id;
	
	private String inventory_name;
	private Double capacity_volume;
	private Date creation_date;
	
	public Inventories() {
		super();
	}



	public String getInventory_name() {
		return inventory_name;
	}

	public void setInventory_name(String inventory_name) {
		this.inventory_name = inventory_name;
	}

	public double getCapacity_volume() {
		return capacity_volume;
	}

	public void setCapacity_volume(double capacity_volume) {
		this.capacity_volume = capacity_volume;
	}

	public Date getCreation_date() {
		return creation_date;
	}

	public void setCreation_date(Date creation_date) {
		this.creation_date = creation_date;
	}
	
}