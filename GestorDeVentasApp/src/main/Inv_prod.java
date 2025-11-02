package com.Hokkaido.GestorDeVentasApp.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Inv_prod {
	@Id
	private int inventory_id;
	private int product_id;
	private int Quantity;
	
	public Inv_prod() {
		super();
	}

	public int getInventory_id() {
		return inventory_id;
	}

	public void setInventory_id(int inventory_id) {
		this.inventory_id = inventory_id;
	}

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public int getQuantity() {
		return Quantity;
	}

	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	

}
