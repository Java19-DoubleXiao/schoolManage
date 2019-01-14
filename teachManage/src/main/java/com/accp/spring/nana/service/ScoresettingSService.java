package com.accp.spring.nana.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.spring.nana.mapper.ScoresettingSMapper;
import com.accp.spring.nana.pojo.ScoreSettingS;

@Service
public class ScoresettingSService {
	
	@Autowired
	ScoresettingSMapper scoresettingMapper;
	
	public List<ScoreSettingS> selectAll(){
		return this.scoresettingMapper.selectAll();
		
	}
}
