package com.accp.spring.xjq.service;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.spring.hq.mapper.HStudentMapper;
import com.accp.spring.hq.pojo.Inform;
import com.accp.spring.hq.vo.StudentOne;
import com.accp.spring.xjq.mapper.InformMapperVo;

@Service
public class InformServiceVo {

	@Autowired
	private InformMapperVo informMapperVo;
	@Autowired
	private HStudentMapper studentMapper;
	
	//发通知
	@Transactional
	public int sendInfomation(Inform inform) {
		this.informMapperVo.insertInform(inform);
		//多个班级用，隔开时   分割班级
		String classs = inform.getAcceptPerson();
		String []a=classs.split(",");        
		for(int i=0;i<a.length;i++){
		    int classId = Integer.parseInt(a[i]);
		    //根据班级查询学生id  循环查数据到通知接收人表
		    List<StudentOne> stu = this.studentMapper.selectAllStu(classId);
		    for (StudentOne student : stu) {
		    	this.informMapperVo.insertAcc(inform.getInformId(),student.getStuId());
			}
		}
		return 1;
	}
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
