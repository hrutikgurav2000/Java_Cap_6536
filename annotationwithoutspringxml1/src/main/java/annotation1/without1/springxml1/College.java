package annotation1.without1.springxml1;
//not configure bean in spring.xml
//configure in class, just write a @Componenet


import org.springframework.stereotype.Component;

@Component("collegeBean") //College collegeBean=new CollegeBean
public class College {
public void test() {
	  System.out.println("Testing class method");
}
}

