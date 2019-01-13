package com.accp.spring.hq.service;


import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.spring.hq.mapper.StudentMapper;
import com.accp.spring.hq.mapper.TeacherMapper;
import com.accp.spring.hq.mapper.WorkMapper;
import com.accp.spring.hq.pojo.Classes;
import com.accp.spring.hq.pojo.Homework;
import com.accp.spring.hq.pojo.Workfinish;
import com.accp.spring.hq.vo.StuCount;
import com.accp.spring.hq.vo.StudentOne;
import com.accp.spring.pojo.Student;

@Service
public class WorkService {
	@Autowired
	private WorkMapper workMapper;
	@Autowired
	private TeacherMapper teacherMapper;
	@Autowired
	private StudentMapper studentMapper;
	
	
	//查询教员所教的班以及所布置的作业
	@Transactional
	public Object selectWork(int teaId){
		List<Classes> classes = this.teacherMapper.selectClassByTea(teaId);
		for (Classes cl : classes) {
			cl.setHw(this.workMapper.selectByClaIdAndTeaId(teaId, cl.getClassId()));
			for (Homework homework : cl.getHw()) {
				StuCount status = this.workMapper.selectDengji(teaId,homework.getWorkId(),cl.getClassId());
				    //0：未登记      6：大于班级人数：已登记    1：登记中
					if(status.getOk()==0) {
						homework.setCount(0);
					}else if(status.getOk()==status.getAll()){
						homework.setCount(6);
					}else if(status.getOk()>0 && status.getOk()<status.getAll()){
						homework.setCount(1);
					}
			}
			
		}		
		return classes;
	}
	
	
	//登记作业情况
	@Transactional
	public int dengji(int workId,int stuId,String score) {
		Pattern pattern = Pattern.compile("^[-\\+]?[\\d]*$"); 
		Matcher isNum = pattern.matcher(score);
		if( !isNum.matches() ){
			//不是数字  存入备注
			this.workMapper.updatewfRemark(score, workId, stuId);
		}else {
			int scores = Integer.parseInt(score);
			this.workMapper.updatewfScore(scores, workId, stuId);
		}
		
		return 1;
	}
	
	
	//布置作业并往完成表插数据
	@Transactional
	public Object buzhi(Homework hw) {
		this.workMapper.buzhiWork(hw);
		//多个班级用，隔开时   分割班级
		String classs = hw.getClassId();
		String []a=classs.split(",");        
		for(int i=0;i<a.length;i++){
		    int classId = Integer.parseInt(a[i]);
		    //根据班级查询学生id  循环查数据到作业情况表
		    List<StudentOne> stu = this.studentMapper.selectAllStu(classId);
		    for (StudentOne student : stu) {
		    	this.workMapper.insertStuToWork(hw.getWorkId(), student.getStuId(), hw.getTeaId());
			}
		}
		return 1;
		//如果有附件，新增附件表 ---再说
	}
	
	
	
}
