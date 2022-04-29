package annotation1.withbean1;

public class College {
	private Principal principal; //Constructor DI
  
public College(Principal principal) {
		
		this.principal = principal;
	}

public void test() {
	principal.principalInfo();
	  System.out.println("Testing class method");
  }
}
