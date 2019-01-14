package com.accp.spring.hq.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.spring.hq.mapper.ExamMapper;
import com.accp.spring.hq.mapper.HStudentMapper;
import com.accp.spring.hq.pojo.ExamPaperHistory;
import com.accp.spring.hq.pojo.Examination;
import com.accp.spring.hq.pojo.StuTest;
import com.accp.spring.hq.vo.Exammation;
import com.accp.spring.hq.vo.StudentOne;

@Service
public class ExamService {
	@Autowired
	private ExamMapper examMapper;
	@Autowired
	private HStudentMapper studentMapper;
	
	//查出这个教员所教的班级的考试      条件：班级id
	public List<Examination> selectAllExam(int classId){
		return this.examMapper.selectAllExam(classId);
	}
	
	//试卷名称，考试时间，考试类型，参加人数，平均分       条件：班级id考试id
	public Exammation selectMation(int classId,int examId) {
		return this.examMapper.selectMation(classId, examId);
	}
	
	//测试每个同学的成绩      条件：班级id考试id
	public List<StuTest> selectScore(int classId,int examId){
		return this.examMapper.selectScore(classId, examId);
	}
	
	//查询出这个教员使用过的历史试卷
	public List<ExamPaperHistory> selectHisByTeaId() {
		return this.examMapper.selectHisByTeaId();
	}
	
	//查询当天的考试班级信息
	public Object selectExamByDate(){
		List<Exammation> ex = this.examMapper.selectExamByDate();
		if(ex==null) {
			return 0;
		}
		return ex;
	}
	
	public Object showExamByDate(String date){
		List<Exammation> ex = this.examMapper.showExamByDate(date);
		if(ex==null || ex.size()==0) {
			return 0;
		}
		return ex;
	}
	
	
	//发布考试
	@Transactional
	public int sendExam(Examination examination) {
		this.examMapper.insertExamination(examination);
		//多个班级用，隔开时   分割班级
		String classs = examination.getClassId();
		String []a=classs.split(",");        
		for(int i=0;i<a.length;i++){
		    int classId = Integer.parseInt(a[i]);
		    //根据班级查询学生id  循环查数据到考试情况表
		    List<StudentOne> stu = this.studentMapper.selectAllStu(classId);
		    for (StudentOne student : stu) {
		    	this.examMapper.insertStuTest(student.getStuId(), examination.getExamId());
			}
		}
		return 1;
	}
	
	
	
	
	
}
