package com.accp.spring.nana.service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.accp.spring.nana.mapper.DormitoryMapper;
import com.accp.spring.nana.mapper.DormrelationMapper;
import com.accp.spring.nana.pojo.ChangeSleep;
import com.accp.spring.nana.pojo.Dormrelation;
import com.accp.spring.nana.vo.DormrelationVo;

@Service
public class DormrelationService {
	
	@Autowired
	DormrelationMapper dormrelationMapper;
	@Autowired
	DormitoryMapper dormitoryMapper;
	
	@Transactional
	public void move(Dormrelation dormrelation,int bedId) {
		//新增一条寝室与学员关系数据
		this.dormrelationMapper.insertDormrelation(dormrelation);
		//原床位损坏为3
		this.dormitoryMapper.updateBed(3, bedId);
		//移动后的床位修改为已住1
		this.dormitoryMapper.updateBed(1, dormrelation.getBedId());
		//将寝室与学员关系表的isues=2
		this.dormrelationMapper.updateDormrelation(bedId);
		//换寝记录表新增一条记录
		System.out.println(dormrelation.getStuId()+"YbedId"+bedId+"XbedId"+dormrelation.getBedId());
		this.dormrelationMapper.insertChangeSleep(dormrelation.getStuId(),bedId,dormrelation.getBedId());
	
	}
	
	public Object selectDormrelations(int dormMangeId,String startTime) throws ParseException{
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		String begin=sdf.format(DateFormat.getDateInstance().parse(startTime));
		System.out.println(begin);
		List<DormrelationVo> dormrelationVos=this.dormrelationMapper.selectDormrelations(dormMangeId, begin);
		if(dormrelationVos==null || dormrelationVos.size()==0) { 
			return 0;
		}else {
			for (DormrelationVo dor : dormrelationVos) {
				dor.setStartTime(begin);
			}
			return dormrelationVos;
		}
		
	}
	
	/*换寝记录*/
	//根据姓名、时间模糊查询所有换寝记录
	public Object selectChangeSleep(String stuName,String startTime){
		List<ChangeSleep> changeSleeps=this.dormrelationMapper.selectChangeSleep(stuName, startTime);
		if(changeSleeps==null) {
			return 0;
		}
		
		return changeSleeps;
	}
	//删除换寝记录
	public int deleteChangeSleep(int id) {
		return this.dormrelationMapper.deleteChangeSleep(id);
	}
	//查询所有换寝记录
	public Object selectChangeSleepAll(int dormMangeId){
		List<ChangeSleep> changeSleeps=this.dormrelationMapper.selectChangeSleepAll(dormMangeId);
		if(changeSleeps==null) {
			return 0;
		}
		
		return changeSleeps;
	}
	
	
}
