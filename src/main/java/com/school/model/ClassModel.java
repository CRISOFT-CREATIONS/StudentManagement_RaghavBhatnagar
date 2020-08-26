package com.school.model;

import java.util.*;

public class ClassModel {
	
	private Long classID;
	
	List<String> enrolledStudents;
	
	List<String> subjectInPeriod;

	public Long getClassID() {
		return classID;
	}

	public void setClassID(Long classID) {
		this.classID = classID;
	}

	public List<String> getEnrolledStudents() {
		return enrolledStudents;
	}

	public void setEnrolledStudents(List<String> enrolledStudents) {
		this.enrolledStudents = enrolledStudents;
	}

	public List<String> getSubjectInPeriod() {
		return subjectInPeriod;
	}

	public void setSubjectInPeriod(List<String> subjectInPeriod) {
		this.subjectInPeriod = subjectInPeriod;
	}
	
	

}
