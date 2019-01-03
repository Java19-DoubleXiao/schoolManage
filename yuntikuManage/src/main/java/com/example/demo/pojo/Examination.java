package com.example.demo.pojo;

import java.io.Serializable;

import lombok.Data;

@Data
public class Examination implements Serializable{
	private int examId;
	private int epexamPaperId;
	private int classId;
	private int teaId;
	private String epSendTime;
	private String startTime;
	private String endTime;
}