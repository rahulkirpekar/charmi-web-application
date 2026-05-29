package com.royal.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out = response.getWriter();
		out.println("<b>FirstServlet : Hello World</b><br>");
		
		// ServletContext
		
		ServletContext context = getServletContext();
		
		Enumeration<String> e = context.getInitParameterNames();
		
		while (e.hasMoreElements()) 
		{
			String paramName = (String) e.nextElement();
			
			String paramValue = context.getInitParameter(paramName);
			
			out.print("<b>"+paramName+" : </b>" + paramValue+"<br>");
		}
		
/*		
		ServletContext context = getServletContext();
		
		String driverClass 	= context.getInitParameter("driverclass");
		String urlPattern 	= context.getInitParameter("urlpattern");
		String userName 	= context.getInitParameter("username");
		String password 	= context.getInitParameter("password");
		
		out.print("<b>driverClass 	 : </b>" + driverClass 	+"<br>");
		out.print("<b>urlPattern 	 : </b>" + urlPattern 	+"<br>");
		out.print("<b>userName 	 	 : </b>" + userName 	+"<br>");
		out.print("<b>password 	 	 : </b>" + password 	+"<br>");
		
		------------------------------------------------------------
		ServletConfig config = getServletConfig();

		Enumeration<String> e = config.getInitParameterNames();
		
		while (e.hasMoreElements()) 
		{
			String paramName = (String) e.nextElement();
			
			String paramValue = config.getInitParameter(paramName);
			
			out.print("<b>"+paramName+" : </b>" + paramValue+"<br>");
		}
*/		
		
		
//		String lang1 = config.getInitParameter("lang1");
//		String lang2 = config.getInitParameter("lang2");
//		String lang3 = config.getInitParameter("lang3");
//		String lang4 = config.getInitParameter("lang4");

//		out.print("<b>lang1 : </b>" + lang1+"<br>");
//		out.print("<b>lang2 : </b>" + lang2+"<br>");
//		out.print("<b>lang3 : </b>" + lang3+"<br>");
//		out.print("<b>lang4 : </b>" + lang4+"<br>");
		
		
	}
}
