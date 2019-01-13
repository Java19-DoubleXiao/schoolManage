package com.accp.spring.xjq.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.spring.pojo.Classes;
import com.accp.spring.pojo.PunchCardSetting;
import com.accp.spring.pojo.Student;
import com.accp.spring.xjq.pojo.ClassInfo;
import com.accp.spring.xjq.pojo.ClassStudent;
import com.accp.spring.xjq.service.ClassesService;
import com.accp.spring.xjq.util.ChineseCharToEn;

@RestController
@RequestMapping("/class")
public class ClassesController {
	
	@Autowired
	private ClassesService classesService;

	@GetMapping("/myClass")
	public List<ClassInfo> selectMyClass(int userId){
		return this.classesService.selectMyClass(userId);
	}
	
	@GetMapping("/getFLetter")
	public String getFirstLetter(String str) {
		 ChineseCharToEn cte = new ChineseCharToEn();  
	     System.out.println("获取拼音首字母："+ cte.getAllFirstLetter(str));
	     return cte.getAllFirstLetter(str);
	}
	

	@GetMapping("/getClassId")
	public int selectClassId(String cName) {
		return this.classesService.selectClassId(cName);
	}
	
	

	@GetMapping("/getStudents")	
	public List<Student> selectStuByClassId(int classId){
		return this.classesService.selectStuByClassId(classId);
	}
	
	
	
	
	
}
