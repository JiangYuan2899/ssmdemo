package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@EnableAutoConfiguration
@SpringBootApplication
public class SsmdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SsmdemoApplication.class, args);
        System.out.println("hello world!");
	}

}
