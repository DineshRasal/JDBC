<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<%! int age=50; %>
		<%! int cube(int n){
			return n*n*n; 
		}%>
	<%= "Expression Tag" %><br>
		<%= "Welcome "+request.getParameter("uname")+" Password: "+request.getParameter("password") +"Age :" +age %><br>
	
	<%
	
	out.print("Scriptlet Tag    ");
	String name=request.getParameter("uname");
	String pass=request.getParameter("password");
	out.print("Welcome "+name+" "+pass);
	%><br>
	<%= "Cube of 3: "+cube(3) %>
</body>
</html>