package com.Hokkaido.GestorDeVentasApp.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Sales {
	@Id
	private int sale_id;
	private int branch_id;
	private int quantity;
	private double tax;
	private double subtotal;
	private double discount;
	private double value;
	
	public Sales() {
		super();
	}
	public int getSale_id() {
		return sale_id;
	}
	public void setSale_id(int sale_id) {
		this.sale_id = sale_id;
	}
	public int getBranch_id() {
		return branch_id;
	}
	public void setBranch_id(int branch_id) {
		this.branch_id = branch_id;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	public double getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
	

}
