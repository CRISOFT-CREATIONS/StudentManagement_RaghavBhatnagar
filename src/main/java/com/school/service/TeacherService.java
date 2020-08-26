package com.school.service;

import org.springframework.beans.factory.annotation.Autowired;import org.springframework.stereotype.Service;

//import com.school.entity.MyClass;
import com.school.entity.Subject;
import com.school.entity.Teacher;
import com.school.model.TeacherModel;
//import com.school.repository.StudentRepository;
import com.school.repository.TeacherRepository;

import java.util.*;;

@Service
public class TeacherService {

	@Autowired
	private TeacherRepository teacherRepo;
	
	
	public TeacherModel getTeacherData(Long teacherID) {
		
		TeacherModel teacherModel = new TeacherModel();
		
		Teacher teacher = teacherRepo.findById(teacherID).orElse(null);
		List<Subject> subList = teacher.getTeachingSubjects();
		List<String> subjectTaught = new ArrayList<>();
		List<Long> classes = new ArrayList<>();
		
		teacherModel.setTeacherID(teacher.getTeacherID());
		teacherModel.setTeacherName(teacher.getTeacherName());
		
		for(Subject s:subList) {
			subjectTaught.add(s.getSubjectName());
			Long classNumber = s.getInPeriod().getbelongingClass().getClassID();
			classes.add(classNumber);
		}
		teacherModel.setSubjects(subjectTaught);
		
		teacherModel.setClasses(classes);
		
		return teacherModel;
		
		
	}
}
