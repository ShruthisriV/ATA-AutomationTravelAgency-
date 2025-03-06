<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/register.css">
</head>
<body>
<div class='bold-line'></div>
<div class='container'>
  <div class='window'>
    <div class='overlay'></div>
    <div class='content'>
      <div class='welcome'>Welcome!</div>
      <div class='subtitle'>We're almost done. Before using our services you need to create an account.</div>
      <div class='input-fields'>
        <form action="register" method="post">
		User Id :<input type="text" name="userId" placeholder="User ID"/><br>
		Email : <input type="email" name="email" placeholder="Email"/><br>
		Password : <input type="password" name="password" placeholder="Password"/><br>
		Phone number : <input type="text" name="phonenumber" placeholder="Phone number"/><br>
	</form>
      
        <!--  <input type='text' name=""placeholder='Username' class='input-line full-width'></input>
        <input type='email' placeholder='Email' class='input-line full-width'></input>
        <input type='password' placeholder='Password' class='input-line full-width'></input> -->
       
      </div>
      <div class='spacing'>or continue with <span class='highlight'>Facebook</span></div>
      <div><button class='ghost-round full-width'>Register</button></div>
    </div>
  </div>
</div>


</body>
</html>