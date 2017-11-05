package com.packtpub.restapp;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

//@Configuration
//@EnableAutoConfiguration
@ComponentScan("com.packtpub")
//@RestController
//@RequestMapping("/user")
@SpringBootApplication
public class TicketManagementApplication {
	
	//@Autowired
	//private UserServiceImpl userService;
	
	@ResponseBody
	@RequestMapping("/test1")
	public String sayAloha(){
		return "Aloha";
	}
	
	@ResponseBody
	@RequestMapping("/test2")
	public Map<String, Object> test(){
		Map<String, Object> map = new LinkedHashMap<>();
		map.put("one", "two");
		map.put("three", "four");
		
		return map;
	}
	
	@ResponseBody
	@RequestMapping("")
	public Map<String, Object> getAllUsers(){
		Map<String, Object> map = new LinkedHashMap<>();
		map.put("result", "Get All Users Implementation");
		
		//userService.getAllUsers();
		
		return map;
	}
	
	@ResponseBody
	@RequestMapping("/{id}")
	public Map<String, Object> getUser(@PathVariable("id") Integer id){
		Map<String, Object> map = new LinkedHashMap<>();
		map.put("result", "Get User Implementation");
		return map;
	}
	
	@ResponseBody
	@RequestMapping(value = "", method = RequestMethod.POST)
	public Map<String, Object> createUser(){
		Map<String, Object> map = new LinkedHashMap<>();
		map.put("result", "Create User Implementation");
		return map;
	}
	
	@ResponseBody
	@RequestMapping(value = "", method = RequestMethod.PUT)
	public Map<String, Object> updateUser(){
		Map<String, Object> map = new LinkedHashMap<>();
		map.put("result", "Update User Implementation");
		return map;
	}

	@ResponseBody
	@RequestMapping(value = "", method = RequestMethod.DELETE)
	public Map<String, Object> deleteUser(){
		Map<String, Object> map = new LinkedHashMap<>();
		map.put("result", "Update User Implementation");
		return map;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(TicketManagementApplication.class, args);
	}
}