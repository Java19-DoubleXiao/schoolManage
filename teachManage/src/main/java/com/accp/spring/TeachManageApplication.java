package com.accp.spring;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages= {"com.accp.spring.mapper"})
public class TeachManageApplication {

	public static void main(String[] args) {
		SpringApplication.run(TeachManageApplication.class, args);
	}

}

