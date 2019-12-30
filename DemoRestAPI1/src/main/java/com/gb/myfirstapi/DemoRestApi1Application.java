package com.gb.myfirstapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.gb.myfirstapi")
@EntityScan("com.gb.myfirstapi.bean")
public class DemoRestApi1Application {

	public static void main(String[] args) {
		SpringApplication.run(DemoRestApi1Application.class, args);
	}

}
