package com.igate.spring.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component(value="sdao")
public class StudentDao {
	private final String STUDENT_COUNT = "select count(*) from public.Student";
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public StudentDao() {
		
	}

	public StudentDao(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int getTotalStudents() {
		return jdbcTemplate.queryForInt(STUDENT_COUNT);
	}

}
