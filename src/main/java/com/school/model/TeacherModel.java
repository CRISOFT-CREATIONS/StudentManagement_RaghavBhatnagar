package com.school.model;

import java.util.*;

public class TeacherModel {
	
	private Long teacherID;
	
	private String teacherName;
	
	List<String> subjects;
	
	List<Long> classes;

	public Long getTeacherID() {
		return teacherID;
	}

	public void setTeacherID(Long teacherID) {
		this.teacherID = teacherID;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public List<String> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}

	public List<Long> getClasses() {
		return classes;
	}

	public void setClasses(List<Long> classes) {
		this.classes = classes;
	}
	
	
	

}
