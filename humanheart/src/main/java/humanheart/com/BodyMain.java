package humanheart.com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;




public class BodyMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		Human obj  =  (Human)ctx.getBean("human", Human.class);
		obj.humnaFunction();
	}
}
