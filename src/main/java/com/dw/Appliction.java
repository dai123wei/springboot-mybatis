package com.dw;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.dw.dao")
public class Appliction {
	
	public static void main(String[] args) {
		SpringApplication.run(Appliction.class, args);
	}
}
