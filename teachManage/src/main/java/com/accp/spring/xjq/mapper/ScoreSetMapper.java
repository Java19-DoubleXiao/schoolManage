package com.accp.spring.xjq.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.accp.spring.pojo.AttendImg;
import com.accp.spring.pojo.ScoreSetting;
import com.accp.spring.pojo.StuAttendance;

public interface ScoreSetMapper {
	
	@Select("SELECT * FROM `scoresetting` WHERE setType = 1 AND isUse = 1 AND setSort = #{setSort}")
	List<ScoreSetting> selectSettingByType(@Param("setSort")int setSort);

	@Insert("INSERT INTO stuattendance(`stuId`,`setId`,`score`,`remark`,`recordPerson`) VALUES(#{stuId},#{setId},#{score},#{remark},#{recordPerson})")
	@Options(useGeneratedKeys=true,keyColumn="saId",keyProperty="saId")
	int insertStuAttence(StuAttendance stuAttence);
	
	@Select("SELECT * FROM scoresetting WHERE setId = #{setId}")
	ScoreSetting selectSetScoreById(@Param("setId")int setId);
	
	
	@Select("INSERT INTO attendimg(saId,imgPath) VALUES(#{saId},#{imgPath})")
	Integer insertAttendImg(AttendImg imgs);
	
	
	
}
