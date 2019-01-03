package com.example.demo.pojo;

import java.io.Serializable;

import lombok.Data;

@Data
public class KnowledgeProgress implements Serializable{
	private int kpId;
	private int stuId;
	private int knowId;
	private double percent;
	private int progressCount;
}
