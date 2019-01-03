package com.example.demo.pojo;

import java.io.Serializable;

import lombok.Data;

@Data
public class Nalyze implements Serializable{
	private int analyzeId;
	private int qtId;
	private String analyzeContent;
	private int stuId;
	private String analyzeTime;
	private int yes;
	private int no;
}
