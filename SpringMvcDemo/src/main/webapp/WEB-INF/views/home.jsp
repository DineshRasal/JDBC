<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Spring MVC Demo</title>
</head>
<body>
	<h1>Welcome to spring mvc application</h1>
	
	<% 
	String s=(String)request.getAttribute("Name");
	Integer i=(Integer)request.getAttribute("id");
	Integer sal=(Integer)request.getAttribute("Salary");
	
	out.print("Name: "+s+" Id: "+i+" Salary: "+sal);
	%>
</body>
</html>