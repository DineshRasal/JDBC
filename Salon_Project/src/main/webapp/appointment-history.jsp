<%@include file="navbar.jsp"%>
<%@page import="dao.*,model.*,java.util.*"%>

<h2 style="color:#d4af37">My Appointments</h2>

<table border="1"
style="background:#14120a;color:white;">

<tr>
<th>Service</th>
<th>Date</th>
<th>Status</th>
<th>Therapist</th>
</tr>

<%
User u=(User)session.getAttribute("user");

List<Appointment> list=
AppointmentDAO.getByUser(u.getId());

for(Appointment a:list){
%>

<tr>
<td><%=a.getService()%></td>
<td><%=a.getDate()%></td>
<td><%=a.getStatus()%></td>
<td><%=a.getTherapist()%></td>
</tr>

<% } %>

</table>
