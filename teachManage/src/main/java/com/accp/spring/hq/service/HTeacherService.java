package com.accp.spring.hq.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.spring.hq.mapper.HStudentMapper;
import com.accp.spring.hq.mapper.HTeacherMapper;
import com.accp.spring.hq.pojo.HClasses;
import com.accp.spring.hq.pojo.Inform;
import com.accp.spring.hq.pojo.TimeTable;
import com.accp.spring.hq.vo.StudentOne;
import com.accp.spring.hq.vo.TeaInfo;
import com.accp.spring.pojo.Student;

@Service
public class HTeacherService {
	@Autowired
	private HTeacherMapper teacherMapper;
	@Autowired
	private HStudentMapper studentMapper;
	
	//查出这个教员所教的班级--给了固定id
	public List<HClasses> selectClassByTea(int userId){
		return this.teacherMapper.selectClassByTea(userId);
	}
	
	//查出这个班级里的学生的信息
	public List<Student> selectStuByClass(int classId){
		return this.teacherMapper.selectStuByClass(classId);
	}
	
	
	
	//发通知
	@Transactional
	public int sendInfomation(Inform inform) {
		this.teacherMapper.insertInform(inform);
		//多个班级用，隔开时   分割班级
		String classs = inform.getAcceptPerson();
		String []a=classs.split(",");        
		for(int i=0;i<a.length;i++){
		    int classId = Integer.parseInt(a[i]);
		    //根据班级查询学生id  循环查数据到通知接收人表
		    List<StudentOne> stu = this.studentMapper.selectAllStu(classId);
		    for (StudentOne student : stu) {
		    	this.teacherMapper.insertAcc(inform.getInformId(),student.getStuId());
			}
		}
		return 1;
	}
	
	
	//收通知
	public List<Inform> selectAccInform(int teaId){
		return this.teacherMapper.selectAccInform(teaId);
	}
	
	//已发通知
	public List<Inform> selectSendInform(int teaId){
		return this.teacherMapper.selectSendInform(teaId);
	}
	
	
	//查看通知详情
	public Inform selectInfoById(int informId,int teaId){
		this.teacherMapper.updateInfoTime(informId, teaId);
		return this.teacherMapper.selectInfoById(informId, teaId);
	}
	
	//查看通知详情   fa 
	public Inform selectSendInfoById(int informId,int teaId){
		return this.teacherMapper.selectSendInfoById(informId, teaId);
	}
	
	//已看通知的人  姓名  头像
	public List<StudentOne> selectLookPeople(int teaId,int informId){
		return this.teacherMapper.selectLookPeople(teaId,informId);
	}
	
	
	
	//删除通知  发
	public int updateInfo(int informId,int teaId) {
		return this.teacherMapper.updateInfo(informId, teaId);
	}
	
	
	
	//删除通知  收
	public int updateAcc(int informId,int teaId) {
		return this.teacherMapper.updateAcc(informId, teaId);
	}
	
	
	public TeaInfo selectMyInfo(int teaId) {
		return this.teacherMapper.selectMyInfo(teaId);
	}
	
	
	public int yanzhengold(int teaId,String teaPwd) {
		int i = this.teacherMapper.yanzhengold(teaId, teaPwd);
		if(i==0) {
			return 0;
		}
		return 1;
	}
	
	public int changepass(int teaId,String teaPwd) {
		return this.teacherMapper.changepass(teaId, teaPwd);
	}
	
	
	public List<TimeTable> selectClassTableByTeaId(int teaId){
		return this.teacherMapper.selectClassTableByTeaId(teaId);
	}
	
	
	public List<TimeTable> selectByDate(int teaId,String lessonTime){
		return this.teacherMapper.selectByDate(teaId, lessonTime);
	}
	
	
}
