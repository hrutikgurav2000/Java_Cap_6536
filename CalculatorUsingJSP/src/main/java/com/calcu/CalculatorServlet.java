package com.calcu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalculatorServlet
 */
@WebServlet(description = "Servlet for calulating java servlet Rpogram", urlPatterns = { "/CalculatorServlet" })
public class CalculatorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = null;
		try {
			out = response.getWriter();
			int i = Integer.parseInt(request.getParameter("txtnum1"));
			int j = Integer.parseInt(request.getParameter("txtnum2"));
			
			int k = 0;
			
			String operation = request.getParameter("btnsubmit");
			if (operation.equals("+")) k = i + j;
			if (operation.equals("-")) k = i - j;
			if (operation.equals("*")) k = i * j;
			if (operation.equals("/")) k = i / j;
			out.println("Result id : " + i + operation + j + " = " + k);
			
		}catch(Exception e) {
			out.print("We goT ERROR " + e.getMessage());
		}finally {
			out.println("<br>");
			out.println("To go back to main page <a href=HomePageCalc.html></a>");
			
		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
