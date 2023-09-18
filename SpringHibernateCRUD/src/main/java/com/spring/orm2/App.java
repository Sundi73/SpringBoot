package com.spring.orm2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm2.Dao.EmployeeDao;
import com.spring.orm2.entities.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
       		
       			EmployeeDao employee = context.getBean("employeeDao",EmployeeDao.class);
       			
       			Employee emp = new Employee(111,"Ashutosh Kumar Tiwari","kolkata");
       			
       			int insert = employee.insert(emp);
       			System.out.println("Data inserted" + insert);
    
    }
}
