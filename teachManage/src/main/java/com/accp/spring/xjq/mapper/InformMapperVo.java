package com.accp.spring.xjq.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;

import com.accp.spring.hq.pojo.Inform;

public interface InformMapperVo {
	
	
	//发通知
		@Insert("INSERT INTO `schoolmanage`.`inform` (`informTypeId`,`informTitle`,`informContent`,`sendPerson`,`acceptPerson`,`isDel`)\r\n" + 
				"VALUES(3,#{informTitle},#{informContent},#{sendPerson},#{acceptPerson},1)")
		@Options(useGeneratedKeys = true, keyProperty = "informId", keyColumn = "informId")
		int insertInform(Inform inform);
		
		@Insert("INSERT INTO `schoolmanage`.`acceptperson` (`informId`,`acceptId`,`acceptType`,`isDel`)\r\n" + 
				"VALUES(#{informId},#{acceptId},1,1);")
		int insertAcc(@Param("informId")int informId,@Param("acceptId")int acceptId);
		
	

}
