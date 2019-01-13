package com.accp.spring.nana.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.spring.nana.mapper.ScoresettingMapper;
import com.accp.spring.nana.pojo.ScoreSetting;

@Service
public class ScoresettingService {
	
	@Autowired
	ScoresettingMapper scoresettingMapper;
	
	public List<ScoreSetting> selectAll(){
		return this.scoresettingMapper.selectAll();
		
	}
}
