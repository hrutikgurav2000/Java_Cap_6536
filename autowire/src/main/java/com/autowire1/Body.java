package com.autowire1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Body {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		Human obj  =  (Human)ctx.getBean("human", Human.class);
		obj.func();

	}

}
