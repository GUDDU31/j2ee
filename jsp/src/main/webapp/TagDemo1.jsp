<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Tag Demo1</title>
</head>
<body>
	<%! List <Integer> list=new ArrayList();%>
	<%
	list.add(1);
	list.add(2);
	list.add(3);
	list.add(4);
	list.add(5);
	%>
	
	<%
	for(Integer num: list){
		%> 
		<h1> <%= num %></h1>
	<% } %>
		
</body>
</html>