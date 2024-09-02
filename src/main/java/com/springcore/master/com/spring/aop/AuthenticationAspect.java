package com.springcore.master.com.spring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AuthenticationAspect {
	@Pointcut("within(com.springcore.master.com.spring.aop..*)")
	public void authPointCut() {
		

	}
	@Pointcut("within(com.springcore.master.com.spring.aop..*)")
	public void authrisationPointCut() {
		
	}
	@Before("authPointCut() && authrisationPointCut()")
	public void authenticate() {
		System.out.println("Authenticating request");
	}
 }
