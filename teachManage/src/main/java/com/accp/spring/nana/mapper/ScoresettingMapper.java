package com.accp.spring.nana.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.accp.spring.nana.pojo.ScoreSetting;

public interface ScoresettingMapper {
	//查询寝室、卫生的规则
	@Select("SELECT * FROM scoresetting WHERE setType=2 AND setSort=3 AND isUse=1")
	List<ScoreSetting> selectAll();
	//根据扣分制度id查询扣分制度分数
	@Select("SELECT * FROM `scoresetting` WHERE setId=#{setId}")
	ScoreSetting selectScoreSetting(@Param("setId") int setId);
}
