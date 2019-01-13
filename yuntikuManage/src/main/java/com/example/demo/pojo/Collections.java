package com.example.demo.pojo;

import java.io.Serializable;

import lombok.Data;

@Data
public class Collections implements Serializable{
	private int collectId;
	private int stuId;
	private int qtId;
	private String collectTime;
}
