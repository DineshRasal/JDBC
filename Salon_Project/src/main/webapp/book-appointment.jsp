<%@include file="navbar.jsp"%>

<script>
function v(){
 if(document.f.date.value==""){
  alert("Select date");
  return false;
 }
 return true;
}
</script>

<div style="width:420px;background:#14120a;padding:20px;">

<h2 style="color:#d4af37">Book</h2>

<form name="f"
onsubmit="return v()"
action="BookAppointmentServlet"
method="post">

Service
<input name="service" required
style="width:100%;">

Date
<input type="date" name="date"
style="width:100%;">

Time
<input name="time" style="width:100%;">

<button style="background:#d4af37;">
Confirm</button>

</form>

</div>
