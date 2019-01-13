package com.accp.springmvc.ljx.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.accp.springmvc.pojo.Book;
import com.accp.springmvc.pojo.Classes;
import com.accp.springmvc.pojo.Course;
import com.accp.springmvc.pojo.Grade;
import com.accp.springmvc.pojo.Knowledge;
import com.accp.springmvc.pojo.Teacher;
import com.accp.springmvc.pojo.Student;

public interface UserMapper {

	/*登录界面*/
	@Select("select stuUserName,stuPwd from student where stuUserName=#{stuUserName} and stuPwd=#{stuPwd}")
	Student selectS(@Param("stuUserName")String stuUserName,@Param("stuPwd")String stuPwd);
	
	@Select("select teaUserName,teaPwd from teacher where teaUserName=#{teaUserName} and teaPwd=#{teaPwd}")
	Teacher selectT(@Param("teaUserName")String teaUserName,@Param("teaPwd")String teaPwd);
	
	@Select("select * from grade")
	List<Grade> selectG();
	
	@Select("select * from book where gId=#{gId}")
	List<Book> selectB(@Param("gId")int gId);
	
	@Select("select * from course where bookId=#{bookId}")
	List<Course> selectC(@Param("bookId")int bookId);
	
	@Select("select * from classes where gId =#{gId}")
	List<Classes> selectCl(@Param("gId")int gId);
	
	@Select("select * from knowledge where courseId=#{courseId}")
	List<Knowledge> selectK(@Param("courseId")int courseId);
	
	/*管理者界面*/
	
	/*学生界面*/
}
