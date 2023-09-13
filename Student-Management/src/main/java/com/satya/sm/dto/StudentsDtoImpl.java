package com.satya.sm.dto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.satya.sm.api.Students;

@Repository
public class StudentsDtoImpl implements StudentsDto {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	@Override
	public List<Students> loadStudents() {
		
		String sql= "select * from students";
		List<Students> listStudents = jdbcTemplate.query(sql, new StudentsRowMapper());
		
		return listStudents;
	}


	@Override
	public void saveStudents(Students students) {
		Object [] args = {students.getFirst_name(),students.getLast_name(),students.getMobile(),
				students.getEmail(),students.getAddress()};
		
		String sql = "insert into students(first_name,last_name,mobile,email,address) values(?,?,?,?,?)";
		
		jdbcTemplate.update(sql, args);
		
		System.out.println("1 record inserted");
		
	}


	@Override
	public Students getStudent(int id) {
		String sql = "select * from students where id = ?";
		Students student = jdbcTemplate.queryForObject(sql, new StudentsRowMapper(),id);
		return student;
	}


	@Override
	public void update(Students students) {
		String sql = "update students set first_name=?,last_name=?,mobile=?,email=?,address=? where id=?";
		jdbcTemplate.update(sql,students.getFirst_name(),students.getLast_name(),students.getMobile(),students.getEmail(),students.getAddress(),students.getId());
		
		System.out.println("1 record updated");
		
	}


	@Override
	public void deleteStudent(int id) {
		String sql = "delete from students where id=?";
		
		jdbcTemplate.update(sql, id);
	}

}
