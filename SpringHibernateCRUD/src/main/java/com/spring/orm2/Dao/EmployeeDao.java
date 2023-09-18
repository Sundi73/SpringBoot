package com.spring.orm2.Dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.orm2.entities.Employee;

public class EmployeeDao {
	
	private HibernateTemplate hibernateTemplate;
	
	//For Creating the value in database
	@Transactional
	public int insert(Employee employee) {
		int insert  = (int)this.hibernateTemplate.save(employee);
		return insert;
	}
	
	// Reading the Single Data from DB
	
	public Employee read(int eId) {
		Employee fetch= this.hibernateTemplate.get(Employee.class, eId);
		return fetch;
	}
	
	public List<Employee> readAll(Employee employee){
		List<Employee>  readAll= this.hibernateTemplate.loadAll(Employee.class);
		return readAll;
	}
	
	public void update(Employee employee) {
		this.hibernateTemplate.update(employee);
	}
	
	public void delete(int eId) {
		Employee employee = this.hibernateTemplate.get(Employee.class, eId);
			hibernateTemplate.delete(employee);
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	

}
