package humanheart.com;

public class Human {
// make referene of heart 
	Heart heart;
	// generate setter n getter
/*
	public Heart getHeart() {
		return heart;
	}

	public void setHeart(Heart heart) {
		this.heart = heart;
	}
	*/
	
	
	public void humnaFunction() {
		
	//
		System.out.println("Human function calling heart");
		heart.heart_func();
	}
	public Human(Heart heart) {
		super();
		this.heart = heart;
	}
}
