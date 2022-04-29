package autowire.with.annocation;

import org.springframework.beans.factory.annotation.Autowired;

public class Human {
	Heart heart;
	
	@Autowired
	public Human(Heart heart) {
		super();
		this.heart = heart;
	}


	public void humnaFunction() {
		
	//
		System.out.println("Human function calling heart");
		heart.heart_func();
	}
	
	
}
