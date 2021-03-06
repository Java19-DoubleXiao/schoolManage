package com.accp.spring.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.accp.spring.pojo.Teacher;

public interface LoginMapper {

	//更换头像
	@Update("update teacher set teaImage=#{teaImage} where teaId=#{teaId}")
	public int UpdateImage(@Param("teaImage")String teaImage,@Param("teaId") int teaId );

	//登录
	@Select("SELECT *FROM teacher WHERE teaUserName=#{teaUserName} AND teaPwd=#{teaPwd}")
	public Teacher login(@Param("teaUserName") String teaUserName,@Param("teaPwd") String teaPwd);
	
	//记住密码
	@Select("SELECT *FROM teacher where teaUserName=#{teaUserName}")
	public Teacher selectremember(@Param("teaUserName") String teaUserName);
	
	//修改记住密码
	@Update("update teacher set remember=#{remember} where teaUserName=#{teaUserName}")
	public int updateRemember(@Param("remember") int remember,@Param("teaUserName") String teaUserName);

	
	
	
	
}
