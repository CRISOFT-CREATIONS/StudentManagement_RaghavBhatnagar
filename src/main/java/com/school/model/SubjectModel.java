package com.school.model;

public class SubjectModel {
	
	private Long subjectID;
	
	private String subjectName;
	
	private String teacher;
	
	private Long periodID;
	
	private Long classID;

	public Long getSubjectID() {
		return subjectID;
	}

	public void setSubjectID(Long subjectID) {
		this.subjectID = subjectID;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public String getTeacher() {
		return teacher;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
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

}
