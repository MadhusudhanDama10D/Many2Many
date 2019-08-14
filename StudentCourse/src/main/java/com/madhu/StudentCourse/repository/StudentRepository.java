package com.madhu.StudentCourse.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.madhu.StudentCourse.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
