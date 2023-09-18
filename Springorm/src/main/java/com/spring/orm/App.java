package com.spring.orm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.Dao.StudentDao;
import com.spring.orm.Entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      ApplicationContext context =  new ClassPathXmlApplicationContext("config.xml");
      StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
//       Student student = new Student(731,"Ashutosh Tiwari","Delhi");
//       
//      int insert = studentDao.insert(student);
//      System.out.println("Data Insert " + insert);
      
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      boolean start = true;
      Student student = new Student();
     
      
      while(start) {
    	  System.out.println("Press 1: Insert Value in Database.");
    	  System.out.println("Press 2: Get detail for Specific Id.");
    	  System.out.println("Press 3: Get all Student Details.");
    	  System.out.println("Press 4: Update Student Details");
    	  System.out.println("Press 5: Delete Student Details");
    	  try {
    		  
    		  int input = Integer.parseInt(br.readLine());
    		  switch(input) {
    		  case 1:
    			  System.out.println("Enter the Detail");
    			  
    			  // add student into table
    			 
    			  student.setStudentId(Integer.parseInt(br.readLine()));
    			  student.setStudentName(br.readLine());
    			  student.setStudentCity(br.readLine());
    			  
    			  int insert = studentDao.insert(student);
    			  System.out.println("Data Inserted "+insert);
    			  
    			  break;
    		  case 2:
    			  //read student details single
    			  int fetch = Integer.parseInt(br.readLine());
    			  Student getStudentSingleEntry = studentDao.getSudent(fetch);
    			  System.out.println(getStudentSingleEntry);
    			  break;
    		  case 3:
    			  //read student details multiple
    			 List<Student> list = studentDao.getAllStudent();
    			 for(Student st: list) {
    				 System.out.println(st);
    			 }
    			  break;
    		  case 5:
    			  //delete student details
    			  int getId = Integer.parseInt(br.readLine());
    			  studentDao.delete(getId);
    			  System.out.println("Deleted Successfully !!");
    			  break;
    			  
    		  case 4:
    			  // update student details
    			  student.setStudentId(Integer.parseInt(br.readLine()));
    			  student.setStudentName(br.readLine());
    			  student.setStudentCity(br.readLine());
    			  
    			  
    			  studentDao.updateStudent(student);
    			  System.out.println("Update Successfully !!");
    			  break;
    		  default:
    			  start = false;
    		
    		
    		  }
			
		} catch (Exception e) {
			System.out.println("Invalid Input..");
			System.out.println(e.getMessage());
		}
      
     }
      System.out.println("Out of the loop");
    }

}
