package com.student.register;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class StudentRegisterServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentRegisterServiceApplication.class, args);
	}

}

