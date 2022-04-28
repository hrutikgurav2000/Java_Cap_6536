package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//making pojo class a servlet
@Controller
public class Pojo_class {
	
	
	//to make it as request
	@RequestMapping("home")
	public String Home() {
		System.out.println("hii");
		return "home.jsp";
	}

}
