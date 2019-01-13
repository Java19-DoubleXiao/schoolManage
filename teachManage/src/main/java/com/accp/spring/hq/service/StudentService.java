package com.accp.spring.hq.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.spring.hq.mapper.StudentMapper;
import com.accp.spring.hq.vo.Dor;
import com.accp.spring.hq.vo.Score;
import com.accp.spring.hq.vo.StudentOne;
import com.accp.spring.pojo.Student;

@Service
public class StudentService {
	@Autowired
	private StudentMapper studentMapper;
	
	//查询单个学生信息
	public StudentOne selectOneStu(int stuId) {
		return this.studentMapper.selectOneStu(stuId);
	}
	
	
	//查询这个学生有没有住寝
	public Object selectDorByStuId(int stuId) {
		Dor dor = this.studentMapper.selectDorByStuId(stuId);
		if(dor==null) {
			return 0;
		}
		return dor;
	}
	
	
	//查询这个班级的人员
	public List<StudentOne> selectAllStu(int classId){
		return this.studentMapper.selectAllStu(classId);
	}
	
	
	//查询学生近期的考试成绩起伏
	public Object selectScore(int stuId,String startTime){
		List<Score> s = this.studentMapper.selectScore(stuId,startTime);
		if(s==null || s.size()==0) {
			return 0;
		}
		return s;
	}
	
	
}
