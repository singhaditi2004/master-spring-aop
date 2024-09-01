package com.springcore.master.com.spring.aop;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {
	public void checkOut() {
		System.out.println("Checkout method from cart");
	}
	 
}
