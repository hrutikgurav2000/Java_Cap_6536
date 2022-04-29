/**
 * 
 */
package com.edubridge.springboot1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author hruti
 * Main method
 *
 */


public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring_xml.xml");
		Student sob = (Student) ctx.getBean("stob");
		sob.display();
		System.out.println(sob);
		
		
		Student sob1 = (Student) ctx.getBean("stob");
		sob1.display();
		System.out.println(sob1);
		
	}

}
