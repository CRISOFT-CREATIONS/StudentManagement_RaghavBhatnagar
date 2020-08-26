package com.school.entity;

import java.util.*;

import javax.persistence.*;

@Entity
@Table(name = "class")
public class VirtualClass {
	
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private Long classID;
	
	@OneToMany
	@JoinTable(name="Students_In_Class",joinColumns = @JoinColumn(name = "classID"),inverseJoinColumns = @JoinColumn(name="studentID"))
	List<Student> enrolledStudents;
	
	@OneToMany
	@JoinTable(name="Periods_In_Class",joinColumns = @JoinColumn(name = "classID"),inverseJoinColumns = @JoinColumn(name="periodID"))
	List<Period> periods;


	public Long getClassID() {
		return classID;
	}

	public void setClassID(Long classID) {
		this.classID = classID;
	}

	public List<Student> getEnrolledStudents() {
		return enrolledStudents;
	}

	public void setEnrolledStudents(List<Student> enrolledStudents) {
		this.enrolledStudents = enrolledStudents;
	}

	public List<Period> getPeriods() {
		return periods;
	}

	public void setPeriods(List<Period> periods) {
		this.periods = periods;
	}

	
}
