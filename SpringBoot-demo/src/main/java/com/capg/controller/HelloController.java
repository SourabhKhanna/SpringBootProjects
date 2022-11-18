package com.capg.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgcom.capg.model.Student;

@RestController
public class HelloController {
	
	
@GetMapping("/hello")
public Student getStudent() {
	Student student=new Student();
	student.setStid(101);
	student.setStName("Name");
	return student;
}
}
