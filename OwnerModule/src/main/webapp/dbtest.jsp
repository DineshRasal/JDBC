<%@ page import="util.DBConnection,java.sql.*" %>

<%
Connection c = DBConnection.getConnection();

if(c!=null)
 out.println("DATABASE CONNECTED SUCCESS");
else
 out.println("FAILED TO CONNECT");
%>
