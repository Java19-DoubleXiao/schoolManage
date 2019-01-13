package com.example.demo.pojo;

import java.io.Serializable;

import lombok.Data;

@Data
public class BrushHistory implements Serializable{
	private int bhId;
	private int stuId;
	private String knowName;
	private int isCommit;
	private String startTime;
	private String endTime;
	
}

