package com.springcore.beanUsingjavaInterface;

//import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/beanUsingjavaInterface/config.xml");
	Student student1= (Student)context.getBean("student1");
	
	System.out.println(student1);
	
	context.close();
	
	}

}
