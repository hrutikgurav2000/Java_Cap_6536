package annotation.with.setter;

import org.springframework.beans.factory.annotation.Autowired;


public class Human {
	
	Heart heart;


	public Heart getHeart() {
		return heart;
	}
	
	@Autowired
	public void setHeart(Heart heart) {
		this.heart = heart;
	}

	
	public void humnaFunction() {
		
	//
		System.out.println("Human function calling heart");
		heart.heart_func();
	}
}
