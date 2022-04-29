package annotation1.withbean1;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


//Main class
public class Main {

	// Main driver method
	public static void main(String[] args)
	{

		
		@SuppressWarnings("resource")
		ApplicationContext context=new AnnotationConfigApplicationContext(CollegeConfig.class);
        
		// a object of College class type
		College college = context.getBean("collegeBean", College.class);
		System.out.println("College object is created "+college);
		college.test();
	}
}
