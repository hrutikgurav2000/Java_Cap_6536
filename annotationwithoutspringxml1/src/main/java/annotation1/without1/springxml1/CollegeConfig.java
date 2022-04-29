package annotation1.without1.springxml1;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration  //tells spring this is configuration class  //define here Componenet-scan
@ComponentScan(basePackages="annotation1.without1.springxml1")  //spring from this packages
public class CollegeConfig {

}
