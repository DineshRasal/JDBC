package com.rushi.rasal.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	
	@Before("execution(* com.rushi.rasal.service.*.*(..))")
	public void logBefore() {
		System.out.println("Logging before method execution..");
	}
	
	@After("execution(* com.rushi.rasal.service.*.*(..))")
	public void logAfter() {
		System.out.println("Logging After method execution..");
	}
	
	@Around("execution(* com.rushi.rasal.service.*.*(..))")
	public void beforeAfter() {
		System.out.println("Before After execution..");
	}
}
