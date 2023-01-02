<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>This is the help page.</title>
</head>
<body>

	<h1>This is the help page</h1>
	<h1>Naam hai awanish , suna hi hoga...</h1>

	<%
		LocalDateTime time = (LocalDateTime) request.getAttribute("time");
		int roll = (Integer) request.getAttribute("roll");
		String name = (String) request.getAttribute("name");
	%>

	<h1>
		The time is :
	${ time }
	</h1>
	<h1>
		The name is :
		${name}</h1>
	<h1>
		The roll is :
		</h1>

</body>
</html>