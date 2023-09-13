package com.satya.sm.dto;

import java.util.List;

import com.satya.sm.api.Students;

public interface StudentsDto {
	
	List<Students> loadStudents();
	void saveStudents(Students students);
	Students getStudent(int id);
	void update(Students students);
	void deleteStudent(int id);

}
