package com.Hokkaido.GestorDeVentasApp.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Inventories {
	
	@Id
	private int inventory_id;
	
	private String inventory_name;
	private double capacity_volume;
	private String creation_date;
	
	public Inventories() {
		super();
	}

	public int getInventory_id() {
		return inventory_id;
	}

	public void setInventory_id(int inventory_id) {
		this.inventory_id = inventory_id;
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

	public String getCreation_date() {
		return creation_date;
	}

	public void setCreation_date(String creation_date) {
		this.creation_date = creation_date;
	}
	
}