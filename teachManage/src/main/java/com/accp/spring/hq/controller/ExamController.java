package com.accp.spring.hq.controller;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.spring.hq.pojo.ExamPaperHistory;
import com.accp.spring.hq.pojo.Examination;
import com.accp.spring.hq.pojo.StuTest;
import com.accp.spring.hq.service.ExamService;
import com.accp.spring.hq.vo.Exammation;
import com.accp.spring.hq.vo.StudentOne;


@RestController
@RequestMapping("/exam")
public class ExamController {
	
	@Autowired
	private ExamService examService;
	
	//查出这个教员所教的班级的考试      条件：班级id
	@GetMapping("/selectAllExam/{classId}")
	public List<Examination> selectAllExam(@PathVariable int classId){
		return this.examService.selectAllExam(classId);
	}
	
	//试卷名称，考试时间，考试类型，参加人数，平均分       条件：班级id考试id
	@GetMapping("/selectMation/{classId}/{examId}")
	public Exammation selectMation(@PathVariable int classId,@PathVariable int examId) {
		return this.examService.selectMation(classId, examId);
	}
	
	//测试每个同学的成绩      条件：班级id考试id
	@GetMapping("/selectScore/{classId}/{examId}")
	public List<StuTest> selectScore(@PathVariable int classId,@PathVariable int examId){
		return this.examService.selectScore(classId, examId);
	}
	
	//查询当天的考试班级信息
	@GetMapping("/selectExamByDate")
	public Object selectExamByDate(){
		return this.examService.selectExamByDate();
	}
	
	@GetMapping("/showExamByDate")
	public Object showExamByDate(String newdate) throws ParseException{
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		String begin=sdf.format(DateFormat.getDateInstance().parse(newdate));
		return this.examService.showExamByDate(begin);
	}
	
	
	//查询出这个教员使用过的历史试卷
	@GetMapping("/historyExam")
	public List<ExamPaperHistory> selectHisByTeaId() {
		return this.examService.selectHisByTeaId();
	}
	
	
	//发布考试
	@PostMapping("/sendExam")
	public int sendExam(@RequestBody Examination examination) throws ParseException {
		System.err.println(examination);
		return this.examService.sendExam(examination);
	}
	
	
	
	
	
}
