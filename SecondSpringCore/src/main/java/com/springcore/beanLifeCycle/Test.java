package com.springcore.beanLifeCycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/beanLifeCycle/beanLifeCycleconfig.xml");
		Apple apple = (Apple)context.getBean("apple");
		
		System.out.println(apple);
		context.registerShutdownHook(); // by this registerShutdownHook() method we destroy the bean life cycle .Its just called after 
										// clossing the IOC container.
	}

}
