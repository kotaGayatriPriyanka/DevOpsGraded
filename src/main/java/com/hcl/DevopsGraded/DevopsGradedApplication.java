package com.hcl.DevopsGraded;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DevopsGradedApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevopsGradedApplication.class, args);
	}
	
	public String display() {
		return "Hello Dev-Ops";
	}

}
