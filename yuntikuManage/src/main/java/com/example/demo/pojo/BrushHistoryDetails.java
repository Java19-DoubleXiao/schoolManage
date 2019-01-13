package com.example.demo.pojo;

import java.io.Serializable;

import lombok.Data;

@Data
public class BrushHistoryDetails implements Serializable{
	private int bhdId;
	private int bhId;
	private int qtId;
	private String rightAnswer;
	private String stuAnswer;
}
