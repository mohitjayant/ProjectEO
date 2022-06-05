package com.moxito;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(scanBasePackages="com.moxito")
@RestController
public class ProjectEoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectEoApplication.class, args);
	}

}
