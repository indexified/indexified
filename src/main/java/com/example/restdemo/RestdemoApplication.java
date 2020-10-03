package com.example.restdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class RestdemoApplication<arr> {
	String nameValue;


	public static void RestdemoApplication(@Value("hello") String nameValue) {
		System.out.println(nameValue);
	}

	static int n1=0;
	static int n2=0;
	static int n3=0;

	public static void main(String[] args) {
		// SpringApplication.run(RestdemoApplication.class, args);

		int count=10;

		for (int i = 0; i < 10; i++) {
			System.out.println(fib(i));
		}

		};

	static int fib(int n)
	{
		// Base Case
		if (n <= 1)
			return n;

		// Recursive call
		return fib(n - 1)
				+ fib(n - 2);
	}



}

