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
@Table(name = "collegestudent")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long sId;
	private String sName;
	

	@ManyToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST,CascadeType.MERGE}, mappedBy = "student")
	private Set<Course> course = new HashSet<>();


	

	public Set<Course> getCourse() {
		return course;
	}

	public void setCourse(Set<Course> course) {
		this.course = course;
	}

	public long getsId() {
		return sId;
	}

	public void setsId(long sId) {
		this.sId = sId;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public Student()
	{
		
	}
	
	public Student(String name)
	{
		this.sName=name;
	}
	
	
	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", course=" + course + "]";
	}

}
