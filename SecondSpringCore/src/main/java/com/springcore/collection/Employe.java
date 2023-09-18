package com.springcore.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employe {
	
	private String eName;
	private List<String> phone;
	private Set<String> address;
	private Map<String, String> courses;
	
	public Employe() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employe(String eName, List<String> phone, Set<String> address, Map<String, String> courses) {
		super();
		this.eName = eName;
		this.phone = phone;
		this.address = address;
		this.courses = courses;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public List<String> getPhone() {
		return phone;
	}

	public void setPhone(List<String> phone) {
		this.phone = phone;
	}

	public Set<String> getAddress() {
		return address;
	}

	public void setAddress(Set<String> address) {
		this.address = address;
	}

	public Map<String, String> getCourses() {
		return courses;
	}

	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Employe [eName=" + eName + ", phone=" + phone + ", address=" + address + ", courses=" + courses + "]";
	}
	
	

}
