 package com.springcore.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
//@ComponentScan(basePackages = "com.springcore.annotations")
public class javaConfig {
	@Bean
	public Student getStudent() {
		Student student = new Student();
		return student;
	}

}
