package com.springcore.beanUsingjavaInterface;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student implements InitializingBean, DisposableBean{
	
	private int studentId;
	private String studentName;
	
	public Student(int studentId, String studentName) {
		super();
		this.studentId=studentId;
		this.studentName=studentName;
	}
	
	

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}



	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + "]";
	}
	
	@Override
	public void afterPropertiesSet() {
		System.out.println("In the init method of java interface");
	}
	
	@Override
	public void destroy() {
		System.out.println("In the destroy() method of java interface");
	}

}
