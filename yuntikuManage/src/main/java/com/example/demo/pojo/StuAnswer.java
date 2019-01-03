package com.example.demo.pojo;

import java.io.Serializable;

import lombok.Data;

@Data
public class StuAnswer implements Serializable{
	private int saId;
	private int examinationId;
	private int qtId;
	private int stuId;
	private String saAnswer;
}
