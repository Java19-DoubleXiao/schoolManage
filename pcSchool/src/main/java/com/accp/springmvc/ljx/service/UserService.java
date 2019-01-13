package com.accp.springmvc.ljx.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.springmvc.ljx.mapper.UserMapper;
import com.accp.springmvc.pojo.Book;
import com.accp.springmvc.pojo.Classes;
import com.accp.springmvc.pojo.Course;
import com.accp.springmvc.pojo.Grade;
import com.accp.springmvc.pojo.Knowledge;
import com.accp.springmvc.pojo.Teacher;
import com.accp.springmvc.pojo.Student;

@Service
public class UserService {

	@Autowired
	private UserMapper userMapper;
	
	public Student selectS(String stuUserName,String stuPwd) {
		return this.userMapper.selectS(stuUserName, stuPwd);
	}
	
	public Teacher selectT(String teaUserName,String teaPwd) {
		return this.userMapper.selectT(teaUserName, teaPwd);
	}
	
	public List<Grade> selectG(){
		return this.userMapper.selectG();
	}
	
	public List<Book> selectB(int gId){
		return this.userMapper.selectB(gId);
	}
	
	public List<Course> selectC(int bookId){
		return this.userMapper.selectC(bookId);
	}
	
	public List<Classes> selectCl(int gId){
		return this.userMapper.selectCl(gId);
	}
	
	public List<Knowledge> selectK(int courseId){
		return this.userMapper.selectK(courseId);
	}
}
