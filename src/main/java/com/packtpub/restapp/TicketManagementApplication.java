package com.packtpub.restapp;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
	
	@ResponseBody
	@RequestMapping("/user")
	public Map<String, Object> getAllUsers(){
		Map<String, Object> map = new LinkedHashMap<>();
		map.put("result", "Get All Users Implementation");
		return map;
	}
	
	@ResponseBody
	@RequestMapping("/user/{id}")
	public Map<String, Object> getUser(@PathVariable("id") Integer id){
		Map<String, Object> map = new LinkedHashMap<>();
		map.put("result", "Create User Implementation");
		return map;
	}
	
	@ResponseBody
	@RequestMapping(value = "/user", method = RequestMethod.POST)
	public Map<String, Object> createUser(){
		Map<String, Object> map = new LinkedHashMap<>();
		map.put("result", "Create User Implementation");
		return map;
	}
	
	@ResponseBody
	@RequestMapping(value = "/user", method = RequestMethod.PUT)
	public Map<String, Object> updateUser(){
		Map<String, Object> map = new LinkedHashMap<>();
		map.put("result", "Update User Implementation");
		return map;
	}

	@ResponseBody
	@RequestMapping(value = "/user", method = RequestMethod.DELETE)
	public Map<String, Object> deleteUser(){
		Map<String, Object> map = new LinkedHashMap<>();
		map.put("result", "Update User Implementation");
		return map;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(TicketManagementApplication.class, args);
	}
}