package com.packtpub.service;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

	@Override
	public String getTest() {
		
		return "inside getTest";
	}
}
