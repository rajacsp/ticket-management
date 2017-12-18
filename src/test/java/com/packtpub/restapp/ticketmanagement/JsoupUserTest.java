package com.packtpub.restapp.ticketmanagement;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.List;

import org.jsoup.Jsoup;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.google.gson.Gson;
import com.packtpub.model.User;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JsoupUserTest {
	
	private final Logger _log = LoggerFactory.getLogger(this.getClass());
	
	@Test
	public void testAllUsers() throws IOException{
		
		String doc = Jsoup.connect("http://localhost:8080/user/100").ignoreContentType(true).get().body().text();
		
		Gson g = new Gson(); 
		User user = g.fromJson(doc, User.class);
		
		_log.info("{test} doc : "+user.getUsername());
				
		assertEquals("David", user.getUsername());
	}	
}
