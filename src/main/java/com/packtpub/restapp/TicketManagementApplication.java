package com.packtpub.restapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

//@Configuration
//@EnableAutoConfiguration
@ComponentScan("com.packtpub")
@SpringBootApplication
@ImportResource("classpath:app-config.xml")
public class TicketManagementApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(TicketManagementApplication.class, args);
	}
}