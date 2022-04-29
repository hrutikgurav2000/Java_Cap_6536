package com.edu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//@SuppressWarnings("resource")
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Spring.xml");
		StudentInf sob = (StudentInf) ctx.getBean("stob");
		sob.display();
		System.out.println(sob);
		//ctx.close();

	}

}
