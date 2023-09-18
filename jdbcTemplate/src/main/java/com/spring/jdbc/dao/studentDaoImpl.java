package com.spring.jdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.entity.Student;

public class studentDaoImpl implements studentDao {
	
	private JdbcTemplate jdbcTemplate;
	
	
	public int insert(Student student) {
		
		String query = "insert into student_table(Id,Name,City) values(?,?,?)";
		int result = this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
		
		return result;
	}
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	
	
	

}
