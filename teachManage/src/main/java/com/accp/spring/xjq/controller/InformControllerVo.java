package com.accp.spring.xjq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.spring.hq.pojo.Inform;
import com.accp.spring.xjq.service.InformServiceVo;

@RestController
@RequestMapping("/inform")
public class InformControllerVo {
	@Autowired
	private InformServiceVo informServiceVo;
	
	
	//发通知
	@PostMapping("/sendInfomation")
	public int sendInfomation(@RequestBody Inform inform) {
		System.err.println(inform);
		return this.informServiceVo.sendInfomation(inform);
	}
	
	

}
