package com.springcore.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		
		ApplicationContext context= new  ClassPathXmlApplicationContext("config.xml");
		 Employe employee1 = (Employe)context.getBean("employee1");
		 
		 System.out.println(employee1);
		 
		 System.out.println(employee1.geteName());
		 System.out.println(employee1.getPhone());
		 System.out.println(employee1.getAddress());
		 System.out.println(employee1.getCourses());
		
	}

}
