package com.accp.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.spring.pojo.Teacher;
import com.accp.spring.service.TeacherService;
@CrossOrigin
@RestController
@RequestMapping("/tea")
public class TeacherController {
	@Autowired
	TeacherService teacherService;
	
	@PostMapping("/UpdateImage")
	public int UpdateImage(String teaImage,int teaId ) {
		String pImage="data:image/png;base64,"+teaImage;
		return this.teacherService.UpdateImage(pImage, teaId);
	}
	
	@PostMapping("/login")
	public Teacher login(String teaUserName,String teaPwd,boolean emember) {
		return this.teacherService.login(teaUserName, teaPwd,emember);
	}
	
	
	@GetMapping("/loginIn")
	public Object loginIn(String teaUserName) {
		return this.teacherService.loginIn(teaUserName);
	}
	
	//try again
	
}
