package com.spring.orm.Dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.orm.Entity.Student;

public class StudentDao {
	
	
	private HibernateTemplate hibernateTemplate;
	
	/* for inserting/save a value in db we have to call 
	hibernatetemplate.*/
	//Saving Data
	@Transactional
	public int insert(Student student) { 
		Integer i = (Integer) this.hibernateTemplate.save(student);
		return i;
	}
	
	//Reading Single Data
	public Student getSudent(int studentId) {
		Student student = this.hibernateTemplate.get(Student.class, studentId);
		return student;
	}
	
	//Reading Multiple data
	public List<Student> getAllStudent(){
		List<Student> student = this.hibernateTemplate.loadAll(Student.class);
		return student;
	}
	
	//delete data
	@Transactional
	public void delete(int studentId) {
		Student student = this.hibernateTemplate.get(Student.class, studentId);
		this.hibernateTemplate.delete(student);
	}
	
	//Update Data
	@Transactional
	public void updateStudent(Student student) {
		this.hibernateTemplate.update(student);
	}
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	

}
