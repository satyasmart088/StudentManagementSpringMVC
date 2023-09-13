package com.satya.sm.dto;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.satya.sm.api.Students;

public class StudentsRowMapper implements RowMapper<Students> {

	@Override
	public Students mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Students students = new Students();
		
		students.setId(rs.getInt("id"));
		students.setFirst_name(rs.getString("first_name"));
		students.setLast_name(rs.getString("last_name"));
		students.setMobile(rs.getLong("mobile"));
		students.setEmail(rs.getString("email"));
		students.setAddress(rs.getString("address"));
		
		
		return students;
	}

}
