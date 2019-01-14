package com.accp.spring.hq.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.accp.spring.hq.service.HStudentService;
import com.accp.spring.hq.vo.Dor;
import com.accp.spring.hq.vo.Score;
import com.accp.spring.hq.vo.StudentOne;
import com.accp.spring.pojo.Student;

@RestController
@RequestMapping("/stu")
public class HStudentController {
	@Autowired
	private HStudentService studentService;
	
	@GetMapping("/selectOne/{stuId}")
	public StudentOne selectOneStu(@PathVariable int stuId) {
		return this.studentService.selectOneStu(stuId);
	}
	
	//查询这个学生有没有住寝
	@GetMapping("/selectDorByStuId")
	public Object selectDorByStuId(int stuId) {
		return this.studentService.selectDorByStuId(stuId);
	}
	
	
	//查询这个班级的人员
	@GetMapping("/showStu/{classId}")
	public List<StudentOne> selectAllStu(@PathVariable int classId){
		return this.studentService.selectAllStu(classId);
	}
	
	
	//查询学生近期的考试成绩起伏
	@GetMapping("/selectScore/{stuId}")
	public Object selectScore(@PathVariable int stuId,
			@RequestParam(defaultValue="2019-01")String datetime){
		return this.studentService.selectScore(stuId,datetime);
	}
	
	
	
	
	
}
