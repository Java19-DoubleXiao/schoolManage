package com.example.demo.pojo;

import java.io.Serializable;

import lombok.Data;

@Data
public class PaperTitle implements Serializable{
	private int ptId;
	private int qtId;
	private int examId;
}
