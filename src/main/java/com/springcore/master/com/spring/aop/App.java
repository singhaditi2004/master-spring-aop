package com.springcore.master.com.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      ApplicationContext context=new AnnotationConfigApplicationContext(BeanConfig.class);
      ShoppingCart cart=context.getBean(ShoppingCart.class);
      cart.checkOut();
      
      
    }
}
