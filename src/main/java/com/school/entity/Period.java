package com.school.entity;

import javax.persistence.*;

@Entity
@Table(name = "period")
public class Period {
	
	@Id
	private Long periodID;
	
	@ManyToOne
	private VirtualClass belongingClass;
	
	@OneToOne(mappedBy = "inPeriod")
	@JoinColumn(name = "subject_id")
	private Subject allottedSubject;


	public Long getPeriodID() {
		return periodID;
	}

	public void setPeriodID(Long periodID) {
		this.periodID = periodID;
	}

	public VirtualClass getbelongingClass() {
		return belongingClass;
	}

	public void setbelongingClass(VirtualClass belongingClass) {
		this.belongingClass = belongingClass;
	}

	public Subject getAllottedSubject() {
		return allottedSubject;
	}

	public void setAllottedSubject(Subject allottedSubject) {
		this.allottedSubject = allottedSubject;
	}

	
}
