package com.royal.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// MIME - Multipurpose Mail Extension
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		out.println("LoginServlet---service()</br>");
		
//		Enumeration<String> e = request.getParameterNames();
//		while (e.hasMoreElements()) 
//		{
//			String paramName = (String) e.nextElement();
//			
//			String paramValue = request.getParameter(paramName);
//			
//			out.println("<b>"+paramName +" : </b>" + paramValue+"</br>");
//		}
		
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");

		RequestDispatcher rd = null;
		
		if (userName.equals("rahul.kirpekar@gmail.com") && password.equals("123456")) 
		{
			rd = request.getRequestDispatcher("loginsuccess.html");
		} else 
		{
			rd = request.getRequestDispatcher("loginfail.html");
		}
		rd.forward(request, response);
	}
}







