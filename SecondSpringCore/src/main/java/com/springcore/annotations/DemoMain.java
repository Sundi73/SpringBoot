package com.springcore.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoMain {

	public static void main(String[] args) {
		ApplicationContext con =
					new AnnotationConfigApplicationContext(javaConfig.class);

		Student student1 = con.getBean("getStudent",Student.class);
		System.out.println(student1);
		student1.study();
	}

}
