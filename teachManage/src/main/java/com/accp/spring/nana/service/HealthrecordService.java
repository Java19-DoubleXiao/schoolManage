package com.accp.spring.nana.service;


import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.SynthesizedAnnotation;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.spring.nana.mapper.HealthrecordMapper;
import com.accp.spring.nana.mapper.ScoresettingMapper;
import com.accp.spring.nana.pojo.Healthrecord;
import com.accp.spring.nana.pojo.Healthrecordimg;
import com.accp.spring.nana.pojo.ScoreSetting;
import com.accp.spring.nana.vo.HealthrecordVo;

@Service
public class HealthrecordService {
	
	@Autowired
	HealthrecordMapper healthrecordMapper;
	@Autowired
	ScoresettingMapper scoresettingMapper;
	//根据宿管id查询被管辖的所有宿舍的卫生扣分情况
	public List<HealthrecordVo> selectHealthrecord( int dormMangeId, String checkTime){
		return this.healthrecordMapper.selectHealthrecord(dormMangeId, checkTime);
	}
	//根据寝室id和日期查询寝室卫生详细情况
	public Object selectHealthrecordDetail(int dormId ,String checkTime){
		List<HealthrecordVo> healthrecord=this.healthrecordMapper.selectHealthrecordDetail(dormId, checkTime);
		//根据卫生id查询卫生图片
		if(healthrecord==null) {
			return 0;
		}else {
			for (HealthrecordVo healthrecordVo : healthrecord) {
				List<Healthrecordimg> healthrecordimgs=this.healthrecordMapper.selectHealthrecordimg(healthrecordVo.getId());
				healthrecordVo.setHealthrecordimgs(healthrecordimgs);
			}
			return healthrecord;
		}
		
	}
	//新增寝室卫生检查
	@Transactional
	public int insertHealthrecord(String [] imgPath,String setId,Integer checkId,Integer checkPerson) {
		//System.out.println(checkId+"sdsdsd"+checkPerson);
		
		String[] set=setId.split(",");
		for (int i = 0; i < set.length; i++) {
			System.out.println(Integer.parseInt(set[i]));
			ScoreSetting scoreSetting=this.scoresettingMapper.selectScoreSetting(Integer.parseInt(set[i]));
			Healthrecord hh=new Healthrecord();
			hh.setSetId(Integer.parseInt(set[i]));
			hh.setCheckId(checkId);
			hh.setCheckType(2);
			hh.setScore(scoreSetting.getSetScore());
			hh.setCheckPerson(checkPerson);
			this.healthrecordMapper.insertHealthrecord(hh);
			
			//新增卫生图片
			System.out.println(imgPath.length);
			if(i==0) {
				for (int j = 0; j < imgPath.length; j++) {
					//System.out.println(imgPath[j]);
					String pImage="data:image/png;base64,"+imgPath[j];
					this.healthrecordMapper.insertHealthrecordImg(hh.getId(), checkPerson, pImage);
					
				}
			}
			
			
			
		}
		return 0;
		
	
		
	
	}
}
