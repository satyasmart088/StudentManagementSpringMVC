package com.satya.sm.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.satya.sm.Service.StudentsService;
import com.satya.sm.api.Students;

@Controller
public class StudentManagementController {
	@Autowired
	StudentsService studentsService;
	
	@GetMapping("/students")
	public String homePage(Model model) {
		List<Students> listStudents = studentsService.loadStudents();
		model.addAttribute("student", listStudents);
		
		
		return "students-page";
	}
	
	@GetMapping("/addStudents")
	public String addStudents(@ModelAttribute("student") Students students) {
		
		return "addStudents";	
		
	}
	
	@PostMapping("/saveStudents")
	public String saveStudents(Students students) {
		if(students.getId()==0) {
			studentsService.saveStudents(students);
		}
		else {
			studentsService.update(students);
		}
		
		return "redirect:/students";
		
	}
	
	@GetMapping("/updateStudent")
	public String updateStudent(@RequestParam("userId") int id,Model model) {
		
		Students theStudent = studentsService.getStudent(id);
		model.addAttribute("student", theStudent);
		
		
		return "addStudents";
		
	}
	@GetMapping("/deleteStudent")
	public String deleteStudent(@RequestParam("userId") int id) {
		
		studentsService.deleteStudent(id);
		
		return "redirect:/students";
	}

}
