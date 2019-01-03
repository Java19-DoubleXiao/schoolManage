package com.example.demo.pojo;

import java.io.Serializable;

import lombok.Data;
@Data
public class QuesOption implements Serializable{
	private int opId;
	private int qtId;
	private String opOrder;
	private String rightOption;
	private int IsRight;
	
}
