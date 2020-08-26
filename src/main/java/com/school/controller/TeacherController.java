package com.school.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.school.model.TeacherModel;
import com.school.service.TeacherService;

@RestController
public class TeacherController {

	@Autowired
	private TeacherService teacherService;
	
	@GetMapping("/getteacherdata/TeacherID/{teacherID}")
	public TeacherModel getTeacherData(@PathVariable Long teacherID) {
		return teacherService.getTeacherData(teacherID);
		
	}
	
}
