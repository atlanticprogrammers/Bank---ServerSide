package com.atlanticprogrammers.bankapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BankApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(BankApplication.class, args);
	}
}

/**
 * 	drop database bank;
	create database bank;
	use  bank;
	show tables;
	SELECT * FROM bank.bank;
	SELECT * FROM bank.details;
	
	References :
		https://www.youtube.com/watch?v=8qhaDBCJh6I&t=1s
		https://www.youtube.com/watch?v=Zyqpo8gxSO0
 * 
 */
