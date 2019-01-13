package com.accp.spring.hq.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.support.incrementer.SybaseAnywhereMaxValueIncrementer;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.accp.spring.hq.pojo.Classes;
import com.accp.spring.hq.pojo.Inform;
import com.accp.spring.hq.pojo.TimeTable;
import com.accp.spring.hq.service.TeacherService;
import com.accp.spring.hq.vo.StudentOne;
import com.accp.spring.hq.vo.TeaInfo;
import com.accp.spring.pojo.Student;

@RestController
@RequestMapping("/teach")
public class TeacherController {
	@Autowired
	private TeacherService teacherService;
	
	//查出这个教员所教的班级
	@GetMapping("/selectClassByTea/{userId}")
	public List<Classes> selectClassByTea(@PathVariable int userId) {
		return this.teacherService.selectClassByTea(userId);
	}
	
	//查出这个班级里的学生的信息
	@GetMapping("/selectStuByClass/{classId}")
	public List<Student> selectStuByClass(@PathVariable int classId) {
		return this.teacherService.selectStuByClass(classId);
	}

	//发通知
	@PostMapping("/sendInfomation")
	public int sendInfomation(@RequestBody Inform inform) {
		System.err.println(inform);
		return this.teacherService.sendInfomation(inform);
	}
	
	
	//显示收通知
	@GetMapping("/selectAccInform/{teaId}")
	public List<Inform> selectAccInform(@PathVariable int teaId){
		return this.teacherService.selectAccInform(teaId);
	}
	
	
	//显示发通知
	@GetMapping("/selectSendInform/{teaId}")
	public List<Inform> selectSendInform(@PathVariable int teaId){
		return this.teacherService.selectSendInform(teaId);
	}
	
	
	//查看通知详情
	@GetMapping("/selectInfoById/{informId}/{teaId}")
	public Inform selectInfoById(@PathVariable int informId,@PathVariable int teaId){
		return this.teacherService.selectInfoById(informId, teaId);
	}
	
	
	//查看通知详情   发
	@GetMapping("/selectSendInfoById/{informId}/{teaId}")
	public Inform selectSendInfoById(@PathVariable int informId,@PathVariable int teaId){
		return this.teacherService.selectSendInfoById(informId, teaId);
	}
	
	
	//已看通知的人  姓名  头像
	@GetMapping("/selectLookPeople/{informId}/{teaId}")
	public List<StudentOne> selectLookPeople(@PathVariable int informId,@PathVariable int teaId){
		return this.teacherService.selectLookPeople(teaId,informId);
	}


	//删除通知   收
	@PostMapping("/updateAcc/{informId}/{teaId}")
	public int updateAcc(@PathVariable int informId,@PathVariable int teaId) {
		return this.teacherService.updateAcc(informId, teaId);
	}

	//删除通知   发
	@PostMapping("/updateInfo/{informId}/{teaId}")
	public int updateInfo(@PathVariable int informId,@PathVariable int teaId){
		return this.teacherService.updateInfo(informId, teaId);
	}
	
	
	
	//我的信息
	@GetMapping("/myInfo/{teaId}")
	public TeaInfo myInfo(@PathVariable int teaId){
		return this.teacherService.selectMyInfo(teaId);
	}
	
	
	@GetMapping("/yanzhengold/{teaId}/{teaPwd}")
	public int yanzhengold(@PathVariable int teaId,@PathVariable String teaPwd) {
		return this.teacherService.yanzhengold(teaId, teaPwd);
	}
	
	@PostMapping("/changepass/{teaId}/{teaPwd}")
	public int changepass(@PathVariable int teaId,@PathVariable String teaPwd) {
		return this.teacherService.changepass(teaId, teaPwd);
	}

	
	@GetMapping("/selectClassTableByTeaId/{teaId}")
	public List<TimeTable> selectClassTableByTeaId(@PathVariable int teaId){
		return this.teacherService.selectClassTableByTeaId(teaId);
	}
	
	@GetMapping("/selectByDate/{teaId}/{lessonTime}")
	public List<TimeTable> selectByDate(@PathVariable int teaId,@PathVariable String lessonTime){
		return this.teacherService.selectByDate(teaId, lessonTime);
	}
	
	
	
	
}
