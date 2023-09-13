package com.satya.sm.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.satya.sm.api.Students;
import com.satya.sm.dto.StudentsDto;

@Service
public class StudentsServiceImpl implements StudentsService {
	@Autowired
	StudentsDto studentsDto;

	@Override
	public List<Students> loadStudents() {
		
		List<Students> listStudents = studentsDto.loadStudents();
		
		
		return listStudents;
	}

	@Override
	public void saveStudents(Students students) {
		studentsDto.saveStudents(students);
		
	}

	@Override
	public Students getStudent(int id) {
		Students student = studentsDto.getStudent(id);
		return student;
	}

	@Override
	public void update(Students students) {
		
		studentsDto.update(students);
	}

	@Override
	public void deleteStudent(int id) {
		studentsDto.deleteStudent(id);
		
	}

}
