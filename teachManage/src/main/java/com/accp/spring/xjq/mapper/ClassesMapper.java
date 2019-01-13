package com.accp.spring.xjq.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.accp.spring.pojo.Classes;
import com.accp.spring.pojo.PunchCardSetting;
import com.accp.spring.pojo.Student;
import com.accp.spring.xjq.pojo.ClassInfo;
import com.accp.spring.xjq.pojo.ClassStudent;

public interface ClassesMapper {

	@Select("SELECT a.`id`,a.`classId`,c.`cName`,a.`userId`,b.`teaName` FROM ctrelation a\r\n"
			+ "INNER JOIN classes c ON a.`classId`=c.`classId`  \r\n"
			+ "INNER JOIN teacher b ON a.`userId`=b.`teaId` \r\n" + "WHERE a.userId = #{userId}  ")
	List<ClassInfo> selectMyClass(@Param("userId") int userId);
	// 查询所有我教的班级

	
	//查询班级所有学生
	@Select("SELECT a.`id`,a.`stuId`,b.`stuName`,a.`classId`,c.`cName`,a.`isChange`,b.`stuImage`,b.`stuType` FROM csrelation a\r\n" + 
			"INNER JOIN classes c ON a.`classId`=c.`classId` \r\n" + 
			"INNER JOIN student b ON a.`stuId`=b.`stuId`\r\n" + 
			"WHERE a.`classId`= #{classId}")
	List<ClassStudent> selectMyStudentByClassId(@Param("classId")int classId);
	
	
	//查询单个学生的基本信息
	
	
	
	/**
	 * 根据班级名称查询班级Id
	 * @param cName
	 * @return
	 */
	@Select("SELECT * FROM classes WHERE cName = #{cName}")
	Classes selectClassIdByCName(@Param("cName")String cName);
	
	/**
	 * 根据班级id查询所有学生
	 * @param classId
	 * @return
	 */
	@Select("SELECT * FROM student WHERE classId = #{classId}")
	List<Student> selectStuByClassId(@Param("classId")int classId);
	
}
