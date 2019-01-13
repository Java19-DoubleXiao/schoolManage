package com.accp.springmvc.ljx.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.springmvc.ljx.service.UserService;
import com.accp.springmvc.pojo.Book;
import com.accp.springmvc.pojo.Course;
import com.accp.springmvc.pojo.Grade;
import com.accp.springmvc.pojo.Knowledge;
import com.accp.springmvc.pojo.Teacher;
import com.accp.springmvc.pojo.Student;

@Controller
@RequestMapping("/manage")
public class Usercontroller {

	@Autowired
	private UserService userService;
	
	@ResponseBody
	@RequestMapping(value="/selectS/{stuUserName}/{stuPwd}",method=RequestMethod.GET)
	public String selectS(@PathVariable String stuUserName,@PathVariable String stuPwd) {
		Student stu = this.userService.selectS(stuUserName, stuPwd);
		if(stu!=null) {
			return "redirect:manage/mainPage";
		}else {
			System.out.println(stu);
			return "";
		}
	}
	
	@ResponseBody
	@RequestMapping(value="/selectT/{teaUserName}/{teaPwd}",method=RequestMethod.GET)
	public int selectT(@PathVariable String teaUserName,@PathVariable String teaPwd) {
		Teacher man = this.userService.selectT(teaUserName, teaPwd);
		if(man!=null) {
			return 1;
		}else {
			return 0;
		}
	}
	
	@GetMapping("/login")
	public String login() {
		return "pageJsp/mLogin.html";
	}
	@GetMapping("/mainPage")
	public String main() {
		return "pageJsp/manageS.html";
	}
	
	@ResponseBody
	@RequestMapping("/selectG")
	public List<Grade> selectG(){
		return this.userService.selectG();
	}
	
	@ResponseBody
	@RequestMapping("/selectB/{gId}")
	public List<Book> selectB(@PathVariable int gId){
		return this.userService.selectB(gId);
	}
	
	@ResponseBody
	@RequestMapping("/selectC/{bookId}")
	public List<Course> selectC(@PathVariable int bookId){
		return this.userService.selectC(bookId);
	}
	
	@ResponseBody
	@RequestMapping("/selectK/{courseId}")
	public List<Knowledge> selectK(@PathVariable int courseId){
		return this.userService.selectK(courseId);
	}
}
