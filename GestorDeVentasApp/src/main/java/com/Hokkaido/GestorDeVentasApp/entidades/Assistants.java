package com.Hokkaido.GestorDeVentasApp.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Transient;

@Entity
public class Assistants {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long assistant_id;
	
	private String first_name;
	private String last_name;
	private String phone;
	private String email;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "warehouse_id")
	private Warehouses warehouse_id;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "branch_id")
	private Branches branch_id;
	
	@Transient
    private Long warehouseIdValue;

    @Transient
    private Long branchIdValue;
	
	

	public Assistants() {
		super();
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
	
	public Long getAssistant_id() {
		return assistant_id;
	}

	public void setAssistant_id(Long assistant_id) {
		this.assistant_id = assistant_id;
	}

	public Warehouses getWarehouse_id() {
		return warehouse_id;
	}

	public void setWarehouse_id(Warehouses warehouse_id) {
		this.warehouse_id = warehouse_id;
	}

	public Branches getBranch_id() {
		return branch_id;
	}

	public void setBranch_id(Branches branch_id) {
		this.branch_id = branch_id;
	}

	public Long getWarehouseIdValue() {
        if (warehouse_id != null) {
            return warehouse_id.getWarehouse_id();
        }
        return warehouseIdValue;
    }

    public void setWarehouseIdValue(Long warehouseIdValue) {
        this.warehouseIdValue = warehouseIdValue;
    }
	
	public Long getBranchIdValue() {
		if (branch_id != null) {
            return branch_id.getBranch_id();
        }
        return branchIdValue;
	}

	public void setBranchIdValue(Long branchIdValue) {
		this.branchIdValue = branchIdValue;
	}
	

}
