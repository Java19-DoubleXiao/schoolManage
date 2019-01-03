package com.example.demo.pojo;

import java.io.Serializable;

import lombok.Data;

@Data
public class ExamPaperKnowledge implements Serializable{
	private int epkId;
	private int epId;
	private int knowId;
	private int count;
}
