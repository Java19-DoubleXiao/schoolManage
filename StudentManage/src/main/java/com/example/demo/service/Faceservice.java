package com.example.demo.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.FeshMapper;
import com.example.demo.pojo.Punchcardrecord;
import com.example.demo.pojo.Student;
import com.example.demo.pojo.newsStudent;

@Service
public class Faceservice {

	@Autowired
	private FeshMapper fm;
	
	
	public int insertface(String face) {
		return this.fm.insertfase(face);
	}
	public List<newsStudent> selectface(){
		
		return this.fm.selectface();
	}
	
	public Student selectadmin(int stuid){
		return this.fm.selectadmin(stuid);
		
	}
	
	
	public Student selectadminpwd(String stuusername,String stupwd ) {
		
		return this.fm.selectadminpwd(stuusername,stupwd);
				
	}
	
	
	
	public Student selecestunamid(String stuname) {
		return this.fm.selectstunameid(stuname);
	}
	
	
	public int insertpunchCardRecord(Punchcardrecord punchcardrecord) {
		return this.fm.insertpunchCardRecord(punchcardrecord);
	}
	                               

	
	
	
}
