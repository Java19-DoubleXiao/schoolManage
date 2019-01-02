package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.example.demo.pojo.Punchcardrecord;
import com.example.demo.pojo.Student;
import com.example.demo.pojo.newsStudent;


public interface FeshMapper {

	
	//¼���沿��Ϣ
	@Insert("INSERT INTO `schoolmanage`.`face` (`face`,stuid)VALUES(#{face},2)")
	public int insertfase(@Param("face")String face);
	
	
	//��ѯ��Ϣ
	@Select("SELECT `face`,`stuid` FROM `face`")
	public List<newsStudent> selectface();
	
	//��ѯ�û�admin	
	@Select("SELECT * FROM student WHERE stuid=#{stuid}")
	public Student selectadmin(@Param("stuid")int stuid);
	
	//查询账号密码
	@Select("SELECT * FROM `schoolmanage`.`student` WHERE student.`stuUserName`=#{stuusername} AND student.`stuPwd`=#{stupwd}")
	public Student selectadminpwd(@Param("stuusername")String stuusername,@Param("stupwd")String stupwd); 
	
	
	//根据用户姓名查询用户id
	@Select("SELECT`stuId`,`stuName`FROM`schoolmanage`.`student`WHERE student.`stuName`=#{stuname}")
	public Student selectstunameid(@Param("stuname")String stuname);
	
	//向打卡考勤存数据
	@Insert("INSERT INTO `schoolmanage`.`punchcardrecord` (`stuId`,`punchTime`,`recordPerson`)VALUES(#{stuId},#{punchTime},#{recordPerson})")
	public int insertpunchCardRecord(Punchcardrecord punchcardrecord);
    
	//
	
}
