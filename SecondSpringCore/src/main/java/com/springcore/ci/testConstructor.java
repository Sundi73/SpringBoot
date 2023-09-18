package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testConstructor {
	
	public static void main(String[] args) {
		
	ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/ci/ciConfig.xml");
	Student student1 = (Student)context.getBean("student1");
	
	   Certificate cer = (Certificate)context.getBean("cer");

	//System.out.println(student1);
	   System.out.println(cer);
	   
	  AmbiTest ambi=  (AmbiTest)context.getBean("ambitest");
	  System.out.println(ambi);
	}

}
