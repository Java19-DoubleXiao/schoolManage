package com.accp.spring.nana.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.spring.nana.mapper.CivilizationdormitorySMapper;
import com.accp.spring.nana.pojo.CivilizationdormitoryS;
import com.accp.spring.nana.vo.CivilizationdormitoryVo;

@Service
public class CivilizationdormitoryService {
	@Autowired
	CivilizationdormitorySMapper civilizationdormitoryMapper;
	
	public Object selectAll(int dormMangeId,String startTime){
		List<CivilizationdormitoryVo> civilizationdormitoryVos=this.civilizationdormitoryMapper.selectAll(dormMangeId,startTime);
		List<CivilizationdormitoryVo> civ=new ArrayList<CivilizationdormitoryVo>();
		
		for (CivilizationdormitoryVo civilizationdormitoryVo : civilizationdormitoryVos) {
			if(civilizationdormitoryVo.getScore()==0) {
				civ.add(civilizationdormitoryVo);
				//return civ;
			}else{
				//return 0;
			}
		}
		return civ;
		
		
	}
}
