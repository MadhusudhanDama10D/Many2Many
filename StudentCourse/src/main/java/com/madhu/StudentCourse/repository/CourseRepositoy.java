package com.madhu.StudentCourse.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.madhu.StudentCourse.model.Course;

public interface CourseRepositoy extends JpaRepository<Course, Long>{
	
	

}
