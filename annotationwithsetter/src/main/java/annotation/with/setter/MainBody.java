package annotation.with.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class MainBody {

	
		// TODO Auto-generated method stub
		public static void main(String[] args) {
			ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
			Human obj  =  (Human)ctx.getBean("human", Human.class);
			obj.humnaFunction();
		
	}

}
