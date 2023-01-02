<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Form submitted successfully</h1>

<h1>name is ${ user.name } </h1>
<h1>email is ${user.email }</h1>
<h1>password is ${user.password }</h1>
</body>
</html>