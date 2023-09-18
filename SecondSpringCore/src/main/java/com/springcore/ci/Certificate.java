package com.springcore.ci;

import java.util.List;

public class Certificate {
	
	private String cName;
	private List<String> booksName;

	public Certificate(String cName, List<String> booksName) {
		super();
		this.cName = cName;
		this.booksName=booksName;
	}
	
	public String toString() {
		return "About Certificate : "+this.cName +" Certified --- Book's Recommanded to certified "+ this.booksName;
	}

}
