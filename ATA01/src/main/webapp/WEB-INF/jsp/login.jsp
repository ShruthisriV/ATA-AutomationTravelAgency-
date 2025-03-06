<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Login Page</title>
<link rel="stylesheet" href="css/login.css">
<style type="text/css">

.but{
height:30px;}
</style>
</head>
<body>
<div class='bold-line'></div>
<div class='container'>
  <div class='window'>
    <div class='overlay'></div>
    <div class='content'>
      <div class='welcome'>Login</div>
      <div class='subtitle'>Please login to your existing account!!</div>
      <div class='input-fields'>
      <h2>${errorMsg}</h2>
		<form action="login" method="post">
		
			Email:<input class="but" type="email" name="email" placeholder="Email"/><br><br>
			Password:<input class="but" type="password" name="password" placeholder="Password"/><br><br>
			
			<button class=butt> Login</button><br>
			<button><a href="register" style=color:black background:transparent>Register</a></button>
		</form>
        <!--<form action="register" method="post">
		 User Id :<input type="text" name="userId" placeholder="User ID"/><br>
		Email : <input type="email" name="email" placeholder="Email"/><br>
		Password : <input type="password" name="password" placeholder="Password"/><br>
		Phone number : <input type="text" name="phonenumber" placeholder="Phone number"/><br>
	</form>-->
      
        <!--  <input type='text' name=""placeholder='Username' class='input-line full-width'></input>
        <input type='email' placeholder='Email' class='input-line full-width'></input>
        <input type='password' placeholder='Password' class='input-line full-width'></input> -->
       
      </div>
      <!--  <div class='spacing'>or continue with <span class='highlight'>Facebook</span></div>
      <div><button class='ghost-round full-width'>Register</button></div> -->
    </div>
  </div>
</div>



</body>
</html>