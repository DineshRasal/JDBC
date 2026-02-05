<%@page import="dao.*,model.*,java.util.*"%>

<h2 style="color:#d4af37">Admin</h2>

<table border="1" style="color:white;">

<%
List<Appointment> list=
AppointmentDAO.getAll();

for(Appointment a:list){
%>

<tr>
<td><%=a.getUserId()%></td>
<td><%=a.getService()%></td>

<td>
<form action="AssignTherapistServlet" method="post">

<input type="hidden" name="aid"
value="<%=a.getId()%>">

<input name="therapist">

<button style="background:#d4af37;">
Assign</button>

</form>
</td>

</tr>

<% } %>

</table>
