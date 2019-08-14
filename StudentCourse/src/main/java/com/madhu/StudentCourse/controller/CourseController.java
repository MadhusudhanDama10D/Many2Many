package com.madhu.StudentCourse.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.madhu.StudentCourse.model.Course;

@RestController
@RequestMapping("/course")
public class CourseController {
	
	@PostMapping("/save")
	public Course insert(@RequestBody Course course)
	{
		return course;
		
	}
	
	public ArrayList<Course> getAll() {
		return null;
		
	}

	
	
	
}
