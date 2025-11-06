package com.Hokkaido.GestorDeVentasApp.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Assistants {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long assistant_id;
	
	private String first_name;
	private String last_name;
	private String phone;
	private String email;
	private Long warehouse_id;
	private Long branch_id;
	
	public Assistants() {
		super();
	}
	
	public Long getAssistant_id() {
		return assistant_id;
	}

	public void setAssistant_id(Long assistant_id) {
		this.assistant_id = assistant_id;
	}

	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public Long getWarehouse_id() {
		return warehouse_id;
	}

	public void setWarehouse_id(Long warehouse_id) {
		this.warehouse_id = warehouse_id;
	}

	public Long getBranch_id() {
		return branch_id;
	}

	public void setBranch_id(Long branch_id) {
		this.branch_id = branch_id;
	}
	
	
}
