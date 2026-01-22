<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="obj1" class="test.User"/>

<% String name="Rushi"; %>
<jsp:setProperty property="name" name="obj1" value="<%= name %>"/>

Record:<br>

<jsp:getProperty property="name" name="obj1"/>
</body>
</html>