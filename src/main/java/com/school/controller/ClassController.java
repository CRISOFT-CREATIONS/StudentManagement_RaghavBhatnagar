package com.school.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.school.model.ClassModel;
import com.school.model.PeriodModel;
import com.school.service.ClassService;

@RestController
public class ClassController {
	
	@Autowired
	private ClassService classService;
	
	
	@GetMapping("/getSubjectInfo")
	public List<ClassModel> getSubjectInfo(Pageable page){
		return classService.getSubjectInfo(page);
	}
	
	@GetMapping("/getperioddata/ClassID/{classID}/PeriodID/{periodID}")
	public PeriodModel getPeriodData(@PathVariable Long classID, @PathVariable Long periodID) {
		return classService.getPeriodData(classID, periodID);
	}

}
