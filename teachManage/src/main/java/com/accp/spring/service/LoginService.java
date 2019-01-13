package com.accp.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.spring.mapper.LoginMapper;
import com.accp.spring.pojo.Teacher;

@Service
public class LoginService {
	@Autowired
	LoginMapper loginMapper;
	//更换头像
	public int UpdateImage(String teaImage,int teaId ) {
		return this.loginMapper.UpdateImage(teaImage, teaId);
	}
	
	public Teacher login(String teaUserName,String teaPwd,boolean emember) {
		System.out.println(emember);
		if(emember==true) {
			Teacher t=this.loginMapper.selectremember(teaUserName);
			if(t.getRemember()==0) {
				this.loginMapper.updateRemember(1, teaUserName);
			}else if(t.getRemember()==1) {
				this.loginMapper.updateRemember(0, teaUserName);
			}
		}else if(emember==false) {
			Teacher t=this.loginMapper.selectremember(teaUserName);
			if(t.getRemember()==1) {
				this.loginMapper.updateRemember(0, teaUserName);
			}else if(t.getRemember()==0) {
				this.loginMapper.updateRemember(1, teaUserName);
			}
		}
		
		return this.loginMapper.login(teaUserName, teaPwd);
		
	}
	public Object loginIn(String teaUserName) {
		Teacher t=this.loginMapper.selectremember(teaUserName);
		if(t==null) {
			return 0;
		}else {
			if(t.getRemember()==1) {
				return t;
			}
			return 0;
		}
		
	
	}
}
