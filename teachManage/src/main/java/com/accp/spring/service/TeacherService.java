package com.accp.spring.service;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.spring.mapper.TeacherMapper;
import com.accp.spring.pojo.Teacher;
@Service
public class TeacherService {
	@Autowired
	TeacherMapper teacherMapper;
	//更换头像
	public int UpdateImage(String teaImage,int teaId ) {
		return this.teacherMapper.UpdateImage(teaImage, teaId);
	}
	
	public Teacher login(String teaUserName,String teaPwd,boolean emember) {
		System.out.println(emember);
		/*if(emember==true) {
			Teacher t=this.teacherMapper.selectremember(teaUserName);
			if(t.getRemember()==0) {
				this.teacherMapper.updateRemember(1, teaUserName);
			}else if(t.getRemember()==1) {
				this.teacherMapper.updateRemember(0, teaUserName);
			}
		}else if(emember==false) {
			Teacher t=this.teacherMapper.selectremember(teaUserName);
			if(t.getRemember()==1) {
				this.teacherMapper.updateRemember(0, teaUserName);
			}else if(t.getRemember()==0) {
				this.teacherMapper.updateRemember(1, teaUserName);
			}
		}*/
		
		return this.teacherMapper.login(teaUserName, teaPwd);
		
	}
	public Object loginIn(String teaUserName) {
		Teacher t=this.teacherMapper.selectremember(teaUserName);
		if(t==null) {
			return 0;
		}else {
			/*if(t.getRemember()==1) {
				return t;
			}*/
			return 0;
		}
		
		
		
	}
	

}
