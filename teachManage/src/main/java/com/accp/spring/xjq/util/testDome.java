package com.accp.spring.xjq.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class testDome {

	public static void main(String[] args) {

		
		String test="2018-12";
        String []a=test.split("-");           
        System.out.println("分解后的单词个数为："+a.length);
	       for(int i=0;i<a.length;i++)
	       {
	     	  System.out.println(a[i]);
	       }



		/*String beginTime = "2018-07-29 14:42:32";
		String endTime = "2018-07-29 12:26:32";
		 
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		 
		try {
			Date date1 = format.parse(beginTime);
			Date date2 = format.parse(endTime);
			
			boolean before = date1.before(date2);
			
			System.out.println(before);
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
		*/
		
		
		
		
		
		
		
		
		/*
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");//设置日期格式
		System.out.println(df.format(new Date()));// new Date()为获取当前系统时间
*/
		
		
		
		
		
		
		
		
	}

}
