package com.hrutik.calc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SquareNumber extends HttpServlet{
	public void doGet(HttpServletRequest req,HttpServletResponse res ) throws IOException {
		
		int k = (int) req.getAttribute("k");
		 
		PrintWriter out = res.getWriter(); //getting writer object to print on webpage
		out.print("Hello to Square.." + k);
	}
}
