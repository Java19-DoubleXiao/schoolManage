package com.accp.spring.nana.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.spring.nana.mapper.RepairsMapper;
import com.accp.spring.nana.pojo.Repairs;
import com.accp.spring.nana.vo.DormitoryVo;
import com.accp.spring.nana.vo.RepairsVo;

@Service
public class RepairsService {

	@Autowired
	RepairsMapper repairsMapper;
	
	public List<DormitoryVo> selectRepairStates(int dormMangeId){
		return this.repairsMapper.selectRepairStates(dormMangeId);
	}
	
	public Object selectRepairs(int repairStates,int dormMangeId){
		List<Repairs> repairs=this.repairsMapper.selectRepairs(repairStates,dormMangeId);
		if(repairs==null) {
			return 0;
		}
		return repairs;
	}
	public RepairsVo selectRepairsDetail(int id) {
		return this.repairsMapper.selectRepairsDetail(id);
	}
	public int updateStates(int repairStates,int id) {
		return this.repairsMapper.updateStates(repairStates,id);
	}
	public int deleteRepairs(int id) {
		return this.repairsMapper.deleteRepairs(id);
	}
}
