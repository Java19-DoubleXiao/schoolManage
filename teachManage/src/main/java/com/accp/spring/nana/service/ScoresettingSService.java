package com.accp.spring.nana.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.spring.hq.mapper.HTeacherMapper;
import com.accp.spring.hq.pojo.Inform;
import com.accp.spring.hq.vo.StudentOne;
import com.accp.spring.nana.mapper.ScoresettingSMapper;
import com.accp.spring.nana.pojo.ScoreSettingS;
import com.accp.spring.nana.vo.DormitoryVo;

@Service
public class ScoresettingSService {
	
	@Autowired
	ScoresettingSMapper scoresettingMapper;
	
	@Autowired
	HTeacherMapper hTeacherMapper;
	
	@Autowired
	public List<ScoreSettingS> selectAll(){
		return this.scoresettingMapper.selectAll();
		
	}
	//发通知
	@Transactional
	public int sendInfomation(Inform inform) {
		this.scoresettingMapper.insertInform(inform);
		//多个班级用，隔开时   分割班级
		String classs = inform.getAcceptPerson();
		String []a=classs.split(",");        
		for(int i=0;i<a.length;i++){
		    int classId = Integer.parseInt(a[i]);
		    //根据班级查询学生id  循环查数据到通知接收人表
		    List<DormitoryVo> stu = this.scoresettingMapper.selectDormitoryVo(classId);
		    for (DormitoryVo student : stu) {
		    	this.scoresettingMapper.insertAcc(inform.getInformId(),student.getStuId());
			}
		}
		return 1;
	}
	//收通知
	public List<Inform> selectAccInform(int teaId){
		return this.scoresettingMapper.selectAccInform(teaId);
	}
	//已发通知
	public List<Inform> selectSendInform(int teaId){
		return this.scoresettingMapper.selectSendInform(teaId);
	}
	//查看通知详情
		public Inform selectInfoById(int informId,int teaId){
			this.scoresettingMapper.updateInfoTime(informId, teaId);
			return this.scoresettingMapper.selectInfoById(informId, teaId);
		}
		
		//查看通知详情   fa 
		public Inform selectSendInfoById(int informId,int teaId){
			return this.scoresettingMapper.selectSendInfoById(informId, teaId);
		}
		
		//已看通知的人  姓名  头像
		public List<StudentOne> selectLookPeople(int teaId,int informId){
			return this.scoresettingMapper.selectLookPeople(teaId,informId);
		}
		
		
		
		//删除通知  发
		public int updateInfo(int informId,int teaId) {
			return this.scoresettingMapper.updateInfo(informId, teaId);
		}
		
		
		
		//删除通知  收
		public int updateAcc(int informId,int teaId) {
			return this.scoresettingMapper.updateAcc(informId, teaId);
		}
}
