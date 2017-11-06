package com.packtpub.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TokenRequiredAspect {

	@Before("@annotation(tokenRequired)")
	public void tokenRequired(TokenRequired tokenRequired) throws Throwable{
		System.out.println("inside token required 1.1");
	}
	
	@Before("execution(* com.packtpub.restapp.HomeController.testAOPWithoutAnnotation())")
	public void tokenRequired() throws Throwable{
		System.out.println("inside token required 1.2");
	}
}
