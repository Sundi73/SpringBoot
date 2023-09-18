package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.jdbc.dao.studentDao;
import com.spring.jdbc.entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Value start getting entered" );
        ApplicationContext context = 
        new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
        
        studentDao studentdao = context.getBean("studentdao",studentDao.class);
        
//        JdbcTemplate template = context.getBean("jdbcTemplate",JdbcTemplate.class);
//        
//        String query = "insert into student_table values(?,?,?)";
//        
//       int result =  template.update(query,123,"Shivam","Lucknow");
//    
//       System.out.println("Number of row effected "+ result);
        
        Student student = new Student();
        student.setId(126);
        student.setName("Kartik");
        student.setCity("Patna");
        
        int result = studentdao.insert(student);
        
        System.out.println("Student Inserted affected row - "+ result);
        
        
        }
}
