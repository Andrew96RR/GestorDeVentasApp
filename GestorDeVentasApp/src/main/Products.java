package com.Hokkaido.GestorDeVentasApp.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Products {
	@Id
	private int product_id;
	private int supplier_id;
	private String product_name;
	private double product_weight;
	private double product_price;
	
	public Products() {
		super();
	}
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public int getSupplier_id() {
		return supplier_id;
	}
	public void setSupplier_id(int supplier_id) {
		this.supplier_id = supplier_id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public double getProduct_weight() {
		return product_weight;
	}
	public void setProduct_weight(double product_weight) {
		this.product_weight = product_weight;
	}
	public double getProduct_price() {
		return product_price;
	}
	public void setProduct_price(double product_price) {
		this.product_price = product_price;
	}
	


}
