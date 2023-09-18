package com.springcore.autowireExp2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testAuto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ApplicationContext context =	new ClassPathXmlApplicationContext("com/springcore/autowireExp2/config.xml");
	Emp emp1= context.getBean("emp1",Emp.class);
	
	System.out.println(emp1);
	//System.out.println(emp1.getAddress().getState());
	//System.out.println(emp1.getId());
	//System.out.println(emp1);
	}

}
