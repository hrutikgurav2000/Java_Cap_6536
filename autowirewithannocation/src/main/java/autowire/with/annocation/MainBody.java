package autowire.with.annocation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//auto wired with construcctor

public class MainBody {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		Human obj  =  (Human)ctx.getBean("human", Human.class);
		obj.humnaFunction();
	}
}
