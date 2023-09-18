package com.springcore.firstCoreSpring;

public class student {
	
	private int studentId ;
	private String studentName;
	private String studentAddress;
	
	
	public student() {
		super();
		// TODO Auto-generated constructor stub
	}


	public student(int studentId, String studentName, String studentAddress) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		System.out.println("I am in Constructor");
	}


	public int getStudentId() {
		return studentId;
	}


	public void setStudentId(int studentId) {
		System.out.println("Setting studentId");
		this.studentId = studentId;
	}


	public String getStudentName() {
		return studentName;
	}


	public void setStudentName(String studentName) {
		System.out.println("Setting StudentName");
		this.studentName = studentName;
	}


	public String getStudentAddress() {
		return studentAddress;
	}


	public void setStudentAddress(String studentAddress) {
		System.out.println("Setting studentAddress");
		this.studentAddress = studentAddress;
	}


	@Override
	public String toString() {
		return "student [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress
				+ "]";
	}
	
	
	

}
