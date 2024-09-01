package com.springcore.master.com.spring.aop;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
@Aspect
@Component
public class LoggingIn {
@Before("execution(aop.ShoppingCart.checkOut())")
public void logging() {
	System.out.println("Loggers here");
}
}
