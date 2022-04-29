package annotation.with.object;

import org.springframework.beans.factory.annotation.Autowired;


public class Human {
	@Autowired
	Heart heart;


	
	
	public void humnaFunction() {
		
	//
		System.out.println("Human function calling heart");
		heart.heart_func();
	}
}
