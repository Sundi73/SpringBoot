package com.springcore.ci;

public class Student {
	
	private String sName;
	private int sAge;
	public Certificate cer;
	
	
	public Student(String sName, int sAge,Certificate cer) {
		this.sName=sName;
		this.sAge=sAge;
		this.cer=cer;
	}
	
	
	@Override
	public String toString() {
		
		return "Student Name : "+this.sName+" Student Age "+this.sAge+"{ "+this.cer+" }";
	}

}
