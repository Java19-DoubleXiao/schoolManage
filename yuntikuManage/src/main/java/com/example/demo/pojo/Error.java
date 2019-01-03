package com.example.demo.pojo;

import java.io.Serializable;

import lombok.Data;

@Data
public class Error implements Serializable{
	private int errorId;
	private int qtId;
	private int stuId;
	private String recentlyAnswer;
	private int answerCount;
	private int errorCount;
	private String lastAnswerTime;
}

