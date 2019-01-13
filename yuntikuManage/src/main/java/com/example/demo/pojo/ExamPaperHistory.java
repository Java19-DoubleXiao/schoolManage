package com.example.demo.pojo;

import java.io.Serializable;

import lombok.Data;

@Data
public class ExamPaperHistory implements Serializable{
	private int paperId;
	private int epId;
	private String paperName;
	private double passrate;
	private int useCount;
	private String createTime;
	private int createPerson;
	private String lastUpdTime;
	private int lastUpdPerson;
	private int isForbid;
}

