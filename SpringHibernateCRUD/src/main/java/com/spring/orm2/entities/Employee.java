package com.spring.orm2.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="employee_details")
public class Employee {
	
	@Id
	@Column(name="eId")
	private int eId;
	@Column(name="eName")
	private String eName;
	@Column(name="eCity")
	private String eCity;
	
	public Employee() {
		super();
	}

	public Employee(int eId, String eName, String eCity) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.eCity = eCity;
	}

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String geteCity() {
		return eCity;
	}

	public void seteCity(String eCity) {
		this.eCity = eCity;
	}

	
	
	
}
