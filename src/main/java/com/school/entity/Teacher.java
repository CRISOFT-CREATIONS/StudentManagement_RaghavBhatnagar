package com.school.entity;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "teacher")
public class Teacher {
	
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private Long teacherID;
	
	private String teacherName;
	
	@OneToMany
	@JoinTable(name="Subjects_Taught",joinColumns = @JoinColumn(name = "teacherID"),inverseJoinColumns = @JoinColumn(name="subjectID"))
	List<Subject> teachingSubjects;

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

	public List<Subject> getTeachingSubjects() {
		return teachingSubjects;
	}

	public void setTeachingSubjects(List<Subject> teachingSubjects) {
		this.teachingSubjects = teachingSubjects;
	}
	

}
