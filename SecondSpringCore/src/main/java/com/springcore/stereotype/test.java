package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/stereotype/config.xml");
		Student student1 = context.getBean("student",Student.class);
		
		//System.out.println(student1);
		//System.out.println(student1.getAddress());
		
		Student student2 = context.getBean("student",Student.class);
		
		
		System.out.println(student1.hashCode() == student2.hashCode());

	
	}

}
