package com.packtpub.restapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.packtpub.service.UserService;

@RestController
@RequestMapping("/one")
public class UserController {
	
	//@Autowired
	//private UserService userService;
	
	@Autowired
	UserService testSevice;

	@ResponseBody
	@RequestMapping("")
	public String sayAloha(){
		return testSevice.getTest();
	}
}