package com.example.demo.pojo;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

@Data
public class Question implements Serializable{
	private int qtId;
	private String qtQuest;
	private int knowId;
	private String qtSendTime;
	private int teaId;
	private int privary;
	private int isDel;
	private List<QuesOption> qtList;
	
}
