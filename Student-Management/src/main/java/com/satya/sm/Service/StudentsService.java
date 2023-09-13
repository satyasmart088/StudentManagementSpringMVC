package com.satya.sm.Service;

import java.util.List;

import com.satya.sm.api.Students;

public interface StudentsService {
	
	List<Students> loadStudents();
	void saveStudents(Students students);
	Students getStudent(int id);
	void update(Students students);
	void deleteStudent(int id);

}
