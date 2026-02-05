<%@include file="navbar.jsp"%>

<h1 style="color:#d4af37;text-align:center;">
Welcome ${sessionScope.user.name}
</h1>

<div style="display:flex;gap:20px;margin:30px;">

<div style="background:#14120a;padding:20px;">
<h3>Book Appointment</h3>
<a href="book-appointment.jsp"
style="background:#d4af37;padding:6px;">
Book</a>
</div>

<div style="background:#14120a;padding:20px;">
<h3>My History</h3>
<a href="appointment-history.jsp"
style="background:#d4af37;padding:6px;">
View</a>
</div>

</div>
  