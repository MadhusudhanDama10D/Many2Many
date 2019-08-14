package com.madhu.StudentCourse.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.madhu.StudentCourse.model.Student;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	
	
	public  Student insert(@RequestBody Student student) {
		return student;
		
	}
	
	
	
	public ArrayList<Student> getAll()
	{
		return null;
		
	}
	
	
	
	
	
	

}
