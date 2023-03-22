package com.jspiders.netflix.netflixdemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/NetflixClone")
public class NetflixClone extends HttpServlet {

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		response.setContentType("txt/html");
		PrintWriter writer=response.getWriter();
		writer.println("\r\n"
				+ "<!DOCTYPE html>\r\n"
				+ "<html lang=\"en\">\r\n"
				+ "<head>\r\n"
				+ "    <meta charset=\"UTF-8\">\r\n"
				+ "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n"
				+ "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n"
				+ "    <title>Document</title>\r\n"
				+ "    <link rel=\"stylesheet\" href=\"style.css\">\r\n"
				+ "    <link rel=\"stylesheet\" href=\"path/to/font-awesome/css/font-awesome.min.css\">\r\n"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+ "    <div class=\"nav\">\r\n"
				+ "        <div class=\"sn\">\r\n"
				+ "            <select name=\"\" id=\"\">\r\n"
				+ "              \r\n"
				+ "               <option value=\"English\" selected>English</option>\r\n"
				+ "               <option value=\"Hindi\">Hindi</option>\r\n"
				+ "               <option value=\"Marathi\">Marathi</option>\r\n"
				+ "               <option value=\"Gujrati\">Gujrati</option>\r\n"
				+ "            </select>\r\n"
				+ "        </div>\r\n"
				+ "        <div class=\"sns\">\r\n"
				+ "           <a href=\"#\" class=\"sign\"><i class=\"fa-thin fa-globe\"></i> Sign In</a>\r\n"
				+ "        </div>\r\n"
				+ "    </div>\r\n"
				+ "\r\n"
				+ "   <div id=\"sec\">\r\n"
				+ "    <div><p class=\"un\">Unlimited movies, TV shows and more.</p></div>\r\n"
				+ "    <div><p class=\"wa\">Watch anywhere. Cancel anytime.</p></div>\r\n"
				+ "    <div><p class=\"re\">Ready to watch? Enter your email to create or restart your membership.</p></div>\r\n"
				+ "    <div class=\"ge\"><input type=\"text\" placeholder=\"Email address\"> <label for=\"\" class=\"la\">Get Started</label></div>\r\n"
				+ "   </div>\r\n"
				+ "</body>\r\n"
				+ "</html>");
		
	}

}
