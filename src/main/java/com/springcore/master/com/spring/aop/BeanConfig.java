package com.springcore.master.com.spring.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Configuration
@EnableAspectJAutoProxy

@ComponentScan(basePackages = "com.springcore.master.com.spring.aop")
public class BeanConfig {

}
