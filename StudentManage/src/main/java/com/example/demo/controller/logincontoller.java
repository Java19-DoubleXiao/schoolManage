package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.ws.RespectBinding;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.pojo.Student;
import com.example.demo.service.Faceservice;

@Controller
@CrossOrigin
public class logincontoller {

	@Autowired
	private Faceservice fv;
	@ResponseBody
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public Object login(String stuusername,String stupwd,HttpSession session,HttpServletRequest req,HttpServletResponse resp){
	   //页面上传的值
		System.out.println(stuusername+"sssssssssssssss"+stupwd);

	   //数据库理查的数据
	   Student stu=this.fv.selectadminpwd(stuusername, stupwd);
	   if(stu!=null){	
		  
		 return stu;
	 }else {
		 return null;
		 
	 }
	
	}
}