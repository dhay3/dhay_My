package com.chz;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan({"com.chz.dao"})
public class ShiroThymeleafAuthorityApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShiroThymeleafAuthorityApplication.class, args);
	}

}
