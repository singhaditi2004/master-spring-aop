package com.springcore.master.com.spring.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingIn {
	@Before("execution(* com.springcore.master.com.spring.aop.ShoppingCart.checkOut(..))")
	public void logging() {
		System.out.println("Loggers here");
	}
	@After("execution(* com.springcore.master.com.spring.aop.ShoppingCart.checkOut(..))")
	public void afterlog() {
		System.out.println("After Logging in");
	}
}
