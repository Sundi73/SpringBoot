package com.springcore.autowire;

public class Emp {
	
	private int id ;
	private Address address;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", address=" + address + "]";
	}
	
	

}
