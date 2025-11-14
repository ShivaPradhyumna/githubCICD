package com.github.cicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class GithubcicdApplication {

	@GetMapping("/home")
	public String home(){
		return "Home...";
	}

	public static void main(String[] args) {
		SpringApplication.run(GithubcicdApplication.class, args);
	}

}
