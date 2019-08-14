package com.madhu.StudentCourse.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "course")
public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long courseId;
	private String courseName;
	
	 @ManyToMany(fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST,CascadeType.MERGE},mappedBy = "course")
	 private Set<Student> student = new HashSet<>();

	public Set<Student> getStudent() {
		return student;
	}

	public void setStudent(Set<Student> student) {
		this.student = student;
	}

	public long getCourseId() {
		return courseId;
	}

	public void setCourseId(long courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	public Course() {
		
	}
	public Course(String name)
	{
		this.courseName=name;
	}

	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", student=" + student + "]";
	}


}
