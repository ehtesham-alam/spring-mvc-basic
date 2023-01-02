<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>Controller</h1>
	<h1>This is my home page.</h1>
	<h1>This is the new page created by the page.</h1>
	<a href="about">About</a>

	<%
		String name = (String) request.getAttribute("name");
		int id = (Integer)request.getAttribute("id");
	%>

	<h1><%=name%></h1>

	<h1>
		Id =
		<%= id %></h1>

<%
List<String> list = (List<String>)request.getAttribute("friends");
for(String s : list){
%>

<h1><%=  s %></h1>

<%} %>

</body>
</html>