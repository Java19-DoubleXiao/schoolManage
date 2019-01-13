package com.accp.spring.nana.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.spring.nana.mapper.DormitoryMapper;
import com.accp.spring.nana.pojo.Bed;
import com.accp.spring.nana.pojo.Dormitory;
import com.accp.spring.nana.pojo.Dormrelation;
import com.accp.spring.nana.vo.DormitoryVo;

@Service
public class DormitoryService {

	@Autowired
	private DormitoryMapper dormitoryMapper;
	
	public List<Dormitory> selectDormitory(int dormType){
		return this.dormitoryMapper.selectDormitory(dormType);
	}
	
	
	public int insertDormitory(Dormitory dormitory) {
		return this.dormitoryMapper.insertDormitory(dormitory);
	}
	
	public int deleteDormitory(int dormId) {
		return this.dormitoryMapper.deleteDormitory(dormId);
	}
	public int selectBedCount(int dormId) {
		int bedSum=this.dormitoryMapper.selectBedCount(dormId);
		int bedCount=this.dormitoryMapper.bedCount(dormId);
		if(bedCount<bedSum) {
			return 1;
		}else {
			return 0;
		}
		
	}
	//查询寝室情况
	public Dormitory selectOne(int dormId) {
		return this.dormitoryMapper.selectOne(dormId);
	}
	//设置寝室长
	public int updateAdmin(int adminId,int dormId) {
		return this.dormitoryMapper.updateAdmin(adminId,dormId);
	}
	
	
	/**
	 * 床位
	 * @param dormId
	 * @return
	 */
	public List<DormitoryVo> selectBed(int dormId){
		return this.dormitoryMapper.selectBed(dormId);
	}
	public int insertBed(Bed bed) {
		return this.dormitoryMapper.insertBed(bed);
		
	}
	public int deleteBed(int bedId) {
		return this.dormitoryMapper.deleteBed(bedId);
	}
	
	public Object selectStates(int dormId){
		List<Bed> bed=this.dormitoryMapper.selectStates(dormId);
		for (Bed bed2 : bed) {
			Dormrelation dormrelation= this.dormitoryMapper.selectDormrelation(bed2.getBedId());
			if(dormrelation!=null) {
				bed2.setStuId(dormrelation.getStuId());
			}
			
		}
		return bed;
		//return this.dormitoryMapper.selectStates(dormId);
	}
	public int updateBed(int bedStates,int bedId) {
		return this.dormitoryMapper.updateBed(bedStates,bedId);
	}
	public List<Bed> selectEmptyBed(int dormId){
		return this.dormitoryMapper.selectEmptyBed(dormId);
	}
}
