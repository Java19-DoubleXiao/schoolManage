package com.example.demo.pojo;

import java.io.Serializable;

import lombok.Data;

@Data
public class Appraise implements Serializable{
	private int id;
	private int appraise;
	private int stuId;
	private int analyzeId;
}