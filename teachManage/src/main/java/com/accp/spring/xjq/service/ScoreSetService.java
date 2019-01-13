package com.accp.spring.xjq.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.spring.pojo.AttendImg;
import com.accp.spring.pojo.ScoreSetting;
import com.accp.spring.pojo.StuAttendance;
import com.accp.spring.xjq.mapper.ScoreSetMapper;

@Service
public class ScoreSetService {
	
	@Autowired
	private ScoreSetMapper scoreSetMapper;
	
	public List<ScoreSetting> selectSettingByType(int setSort){
		return this.scoreSetMapper.selectSettingByType(setSort);
	}
	
	public int insertStuAttence(StuAttendance stuAttence) {
		return this.scoreSetMapper.insertStuAttence(stuAttence);
	}

	@Transactional
	public int insertStuAttence(String [] imgPath,int stuId, int[] setId , String remark) {
		int teaId = 1;
		int j = 0;
		for (int i : setId) {
			StuAttendance sa = new StuAttendance();
			sa.setSetId(i);
			sa.setStuId(stuId);
			sa.setRemark(remark);
			ScoreSetting ss = this.scoreSetMapper.selectSetScoreById(i);
			sa.setScore(ss.getSetScore());
			sa.setRecordPerson(teaId);
			j = this.scoreSetMapper.insertStuAttence(sa);
			if(ss.getSetSort() == 3 && imgPath.length != 0) {
				for (String imgpath : imgPath) {
					AttendImg img = new AttendImg();
					img.setSaId(sa.getSaId());
					img.setImgPath(imgpath);
					this.scoreSetMapper.insertAttendImg(img);
				}
			}
			
		}
		return j;
	}

}
