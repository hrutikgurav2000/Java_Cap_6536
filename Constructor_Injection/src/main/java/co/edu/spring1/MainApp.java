package co.edu.spring1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		ApplicationContext ctx = new ClassPathXmlApplicationContext("NewFile.xml");
		Student sob = (Student) ctx.getBean("stob");
		sob.display();
		System.out.println(sob);
		
	}

}
