package com.jspider.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Skills")
public class Skills extends HttpServlet {
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("txt/html");
		PrintWriter writer= response.getWriter();
		String [] skills = request.getParameterValues("Skills");
		writer.print("<h1>Welcome</h1>");
		for(String skill: skills) {
			writer.println("<h3>"+skill+"</h3>");
		}
	}

}
