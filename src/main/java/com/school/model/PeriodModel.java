package com.school.model;

public class PeriodModel {
	
	private Long periodID;
	private Long classID;
	private String periodTime;
	
	private String allottedSubject;
	
	private int studentSize;
	private String teacherName;
	
	public String getPeriodTime() {
		return periodTime;
	}

	public void setPeriodTime(String periodTime) {
		this.periodTime = periodTime;
	}

	public Long getPeriodID() {
		return periodID;
	}

	public void setPeriodID(Long periodID) {
		this.periodID = periodID;
	}

	public Long getClassID() {
		return classID;
	}

	public void setClassID(Long classID) {
		this.classID = classID;
	}

	public String getAllottedSubject() {
		return allottedSubject;
	}

	public void setAllottedSubject(String allottedSubject) {
		this.allottedSubject = allottedSubject;
	}

	public int getStudentSize() {
		return studentSize;
	}

	public void setStudentSize(int studentSize) {
		this.studentSize = studentSize;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}


	
	
	
}
