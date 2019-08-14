//package com.madhu.StudentCourse.model;
//
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToMany;
//import javax.persistence.Table;
//
//@Entity
//@Table(name = "links")
//public class Links {
//	@Id
//	@ManyToMany
//	@JoinColumn(name = "sId")
//	private Course course;
//	private Student student;
//
//	@ManyToMany
//	@JoinColumn(name = "cId")
//
//	public Student getStudent() {
//		return student;
//	}
//
//	public void setStudent(Student student) {
//		this.student = student;
//	}
//
//	public Course getCourse() {
//		return course;
//	}
//
//	public void setCourse(Course course) {
//		this.course = course;
//	}
//
//}
