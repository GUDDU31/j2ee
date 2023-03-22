package com.jspider.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/EmpRegistration")
public class EmpRegistration extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		response.setContentType("txt/html");
		 PrintWriter writer = response.getWriter();
		 
		 String name= request.getParameter("name");
		 String contact= request.getParameter("contact");
		 String email= request.getParameter("email");
		 String address= request.getParameter("address");
		 
		 writer.println("<h1> Wecome "+name+" </h1>");
		 writer.println("<h3> contact "+contact+" </h3>");
		 writer.println("<h3> email "+email+" </h3>");
		 writer.println("<h3> address "+address+" </h3>");
	}
}
