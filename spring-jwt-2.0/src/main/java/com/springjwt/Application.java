package com.springjwt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
//		BCryptPasswordEncoder  passwordEncoder = new BCryptPasswordEncoder();
//		String testPasswordEncoded = passwordEncoder.encode("venky");
//		System.out.println("encoded password = "+testPasswordEncoded);

		SpringApplication.run(Application.class, args);

	}



}
