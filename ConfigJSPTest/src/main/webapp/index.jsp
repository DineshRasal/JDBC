<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	out.print("Welcome "+request.getParameter("uname"));
	
	String ddriver=config.getInitParameter("Iname");
	out.print("Driver is :"+ddriver);
	%>
	<br>
	
	<% 
	String Cparameter=application.getInitParameter("cpara");
	out.print("Context Parameter Project level is:"+Cparameter);
	
	
	%>
		<a href="welcome.jsp">Visit Welcome Page</a>
	
</body>
</html>