package com.example.demo.pojo;

import java.io.Serializable;

import lombok.Data;

@Data
public class ExamPaper implements Serializable {
	private int epId;
	private String epName;
	private int score;
	private String testRange;
	private int teaId;
	private String epSendTime;
	private int gid;
	private int useCount;
	private int testTime;
	private int isForbid;
}