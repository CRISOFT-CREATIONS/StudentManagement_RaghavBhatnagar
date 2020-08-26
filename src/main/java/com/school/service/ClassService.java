package com.school.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.school.entity.VirtualClass;
import com.school.entity.Period;
import com.school.entity.Student;
import com.school.model.ClassModel;
import com.school.model.PeriodModel;
import com.school.repository.ClassRepository;

@Service
public class ClassService {
	
	@Autowired
	private ClassRepository classRepo;
	
	@Transactional public List<ClassModel> getSubjectInfo(Pageable page){
		
		List<ClassModel> classModelList = new ArrayList<>();
		
		Page<VirtualClass> classEntity = classRepo.findAll(page);
		
		for(VirtualClass c:classEntity) {
			ClassModel temp = new ClassModel();
			
			temp.setClassID(c.getClassID());
			
			List<String> studentNames = new ArrayList<>();
			
			for(Student s:c.getEnrolledStudents()) {
				studentNames.add(s.getStudentName());
			}
			
			temp.setEnrolledStudents(studentNames);
			
			List<String> subjects = new ArrayList<>();
			for(Period p:c.getPeriods()) {
				subjects.add(p.getAllottedSubject().getSubjectName());
			}
			temp.setSubjectInPeriod(subjects);
			
			classModelList.add(temp);
		}
		
		return classModelList;
		
	}
	
	public PeriodModel getPeriodData(Long classID, Long periodID) {
		
		VirtualClass myclass = classRepo.findById(classID).orElse(new VirtualClass());
		
		List<Period> periodList = myclass.getPeriods();
		PeriodModel period = new PeriodModel();
		
		for(Period p:periodList) {
			if(p.getPeriodID()==periodID) {
				
				int studentSize = myclass.getEnrolledStudents().size();
				String teacherName = p.getAllottedSubject().getTaughtBy().getTeacherName();
				String subjectName = p.getAllottedSubject().getSubjectName();
				
				period.setClassID(classID);
				period.setPeriodID(periodID);
				period.setStudentSize(studentSize);
				period.setTeacherName(teacherName);
				period.setAllottedSubject(subjectName);	
				period.setPeriodTime("30 minutes");
			}
		}
		
		return period;
		
	}
}
