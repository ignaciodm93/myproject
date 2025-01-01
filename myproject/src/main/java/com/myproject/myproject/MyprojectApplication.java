package com.myproject.myproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.myproject.myproject.entities.LombokTest;

@SpringBootApplication
public class MyprojectApplication {

	public static void main(String[] args) {
		LombokTest lt = new LombokTest();
		lt.setTestVariable(">: 4 8 15 16 23 42 ...");
		System.out.println(lt.getTestVariable());
		SpringApplication.run(MyprojectApplication.class, args);
	}

}
