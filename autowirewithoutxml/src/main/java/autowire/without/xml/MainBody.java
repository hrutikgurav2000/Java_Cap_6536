package autowire.without.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainBody {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		ClassWithAnnotaion obj  =  (ClassWithAnnotaion)ctx.getBean("class_with_annotaion", ClassWithAnnotaion.class);
		System.out.println("object create " + obj);
	}

}
