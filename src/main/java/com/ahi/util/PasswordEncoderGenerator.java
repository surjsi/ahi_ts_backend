package com.ahi.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder; 

public class PasswordEncoderGenerator {

	public static void main(String[] args) {

		String password = "test";
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String hashedPassword = passwordEncoder.encode(password);

		System.out.println(hashedPassword);
	

	  }
}
