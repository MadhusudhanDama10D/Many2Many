//package com.madhu.StudentCourse.service;
//
//import java.util.ArrayList;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import com.madhu.StudentCourse.model.Course;
//import com.madhu.StudentCourse.model.Links;
//import com.madhu.StudentCourse.model.Student;
//import com.madhu.StudentCourse.repository.CourseRepositoy;
//import com.madhu.StudentCourse.repository.LinksRepository;
//import com.madhu.StudentCourse.repository.StudentRepository;
//
//@Component
//public class Service {
//	@Autowired
//	CourseRepositoy repo;
//	@Autowired
//	StudentRepository repos;
//	@Autowired
//	LinksRepository reposs;
//	
//	public Student insert(Student student ) {
//		return repos.save(student);
//		
//	}
//	
//	
//	public ArrayList<Student> getAll()
//	{
//		return (ArrayList<Student>) repos.findAll();
//		
//	}
//	
//	
//	public Course newInsert(Course course)
//	{
//		return repo.save(course);
//		
//	}
//
//	
//	public  ArrayList<Course> newGetAll() {
//		return (ArrayList<Course>) repo.findAll();
//		
//	}
//	
//	
//	public Links insert(Links links) {
//		return reposs.save(links);
//		
//	}
//	
//	public ArrayList<Links> get()
//	{
//		return (ArrayList<Links>) reposs.findAll();
//		
//	}
//}
