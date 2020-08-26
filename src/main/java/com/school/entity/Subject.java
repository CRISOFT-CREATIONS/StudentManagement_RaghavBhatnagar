package com.school.entity;

import javax.persistence.*;

@Entity
@Table(name = "subject")
public class Subject {
	
	@Id
	private int subjectID;
	
	private String subjectName;
	
	@ManyToOne
	private Teacher taughtBy;
	
	@OneToOne
	@JoinColumn(name="period_id")
	private Period inPeriod;

	public Subject() {
		super();
	}

	public Subject(int subjectID, String subjectName, Teacher taughtBy, Period inPeriod) {
		super();
		this.subjectID = subjectID;
		this.subjectName = subjectName;
		this.taughtBy = taughtBy;
		this.inPeriod = inPeriod;
	}

	public int getSubjectID() {
		return subjectID;
	}

	public void setSubjectID(int subjectID) {
		this.subjectID = subjectID;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public Teacher getTaughtBy() {
		return taughtBy;
	}

	public void setTaughtBy(Teacher taughtBy) {
		this.taughtBy = taughtBy;
	}

	public Period getInPeriod() {
		return inPeriod;
	}

	public void setInPeriod(Period inPeriod) {
		this.inPeriod = inPeriod;
	}
	

	
}
