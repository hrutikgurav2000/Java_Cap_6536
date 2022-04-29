package com.hrutik.calc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddNumberServlet extends HttpServlet {
 /*
	public void service(HttpServletRequest req,HttpServletResponse res ) throws IOException {
		
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int k = i + j ;
		
		//System.out.println("Result is " + k);
		PrintWriter out = res.getWriter();
		out.println("Result is " + k);
		
	} */
	
	// when we specify method type in form as GEt and post we can make user of "doGet" and "doPost"
	public void doGet(HttpServletRequest req,HttpServletResponse res ) throws IOException, ServletException {
		
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int k = i + j ;
		k = k * k;
		//System.out.println("Result is " + k);
		/*
		PrintWriter out = res.getWriter();
		out.println("Result is " + k);
		*/
		req.setAttribute("k", k); //passing key n value
		//session management
		RequestDispatcher rd  = req.getRequestDispatcher("square");
		rd.forward(req, res);
		
	}

}
