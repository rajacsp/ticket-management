package com.packtpub.restapp.ticketmanagement;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Configuration
@EnableAutoConfiguration
@ComponentScan
@RestController
public class TicketManagementApplication {
	
	@ResponseBody
	@RequestMapping("/")
	public String sayAloha(){
		return "Aloha";
	}
	
	@ResponseBody
	@RequestMapping("/test")
	public Map<String, Object> test(){
		Map<String, Object> map = new LinkedHashMap<>();
		map.put("one", "two");
		map.put("three", "four");
		
		return map;
	}

	public static void main(String[] args) {
		SpringApplication.run(TicketManagementApplication.class, args);
	}
}