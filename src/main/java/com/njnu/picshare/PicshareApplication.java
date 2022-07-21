package com.njnu.picshare;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.njnu.picshare.mapper")
public class PicshareApplication {

	public static void main(String[] args) {
		SpringApplication.run(PicshareApplication.class, args);
	}

}
