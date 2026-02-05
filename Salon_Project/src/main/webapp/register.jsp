<script>
function check(){
 var p=document.f.password.value;

 if(p.length<6){
  alert("Password min 6");
  return false;
 }
 return true;
}
</script>

<div style="
width:380px;
margin:40px auto;
background:#14120a;
padding:20px;
border:1px solid #2a2616;
color:white;">

<h2 style="color:#d4af37">Create Account</h2>

<form name="f"
action="RegisterServlet"
method="post"
onsubmit="return check()">

Name
<input name="name" required
style="width:100%;padding:8px;margin:6px 0;
background:black;color:white;border:1px solid #333;">

Email
<input name="email" type="email" required
style="width:100%;padding:8px;margin:6px 0;
background:black;color:white;border:1px solid #333;">

Password
<input name="password" type="password" required
style="width:100%;padding:8px;margin:6px 0;
background:black;color:white;border:1px solid #333;">

Phone
<input name="phone" required
style="width:100%;padding:8px;margin:6px 0;
background:black;color:white;border:1px solid #333;">

<button style="
background:#d4af37;
border:none;
padding:8px 16px;">
Register</button>

</form>

<a href="login.jsp" style="color:#d4af37">
Already Login?</a>

</div>
