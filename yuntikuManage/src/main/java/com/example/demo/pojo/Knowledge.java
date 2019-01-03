package com.example.demo.pojo;

import java.io.Serializable;

import lombok.Data;

@Data
public class Knowledge implements Serializable{
	private int knowId;
	private String knowName;
	private int courseId;
}
