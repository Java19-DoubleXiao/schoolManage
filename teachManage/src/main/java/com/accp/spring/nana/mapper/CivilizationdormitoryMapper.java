package com.accp.spring.nana.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.accp.spring.nana.pojo.Civilizationdormitory;
import com.accp.spring.nana.vo.CivilizationdormitoryVo;

public interface CivilizationdormitoryMapper {
	
	//根据宿管id所有文明寝室
	@Select("SELECT a.`dormId`,a.`dormNum`,\r\n" + 
			"(SELECT SUM(score) FROM healthrecord\r\n" + 
			"INNER JOIN `dormitory` ON `dormId`=healthrecord.`checkId`\r\n" + 
			"WHERE `checkId` = a.dormId AND healthrecord.`checkTime` LIKE '%${checkTime}%') score \r\n" + 
			"FROM dormitory a\r\n" + 
			"WHERE a.`dormMangeId`=#{dormMangeId} ORDER BY score")
	List<CivilizationdormitoryVo> selectAll(@Param("dormMangeId") int dormMangeId,String checkTime);
	
	//新增文明寝室
	@Insert("INSERT INTO civilizationdormitory(dormId,startTime,endTime,fraction)\r\n" + 
			"VALUES(#{dormId},now(),now(),#{fraction})")
	int insertCiv(Civilizationdormitory civilizationdormitory);
}
