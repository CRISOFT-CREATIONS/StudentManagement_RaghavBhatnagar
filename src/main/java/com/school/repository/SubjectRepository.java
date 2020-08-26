package com.school.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.school.entity.Subject;

public interface SubjectRepository extends JpaRepository<Subject, Long> {

	public List<Subject> findBySubjectName(String name);
	
}
