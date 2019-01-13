package com.example.demo.pojo;

import java.io.Serializable;

import lombok.Data;

@Data
public class StuTest implements Serializable{
	private int id;
	private int stuId;
	private int examinationId;
	private int status;
	private String startTime;
	private String commitTime;
	private int commitStyle;
	private int score;
}
