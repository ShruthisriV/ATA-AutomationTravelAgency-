<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style>
body {
  background-image: url("https://e1.pxfuel.com/desktop-wallpaper/478/534/desktop-wallpaper-backgrounds-for-travel-website-travel-agency.jpg");
  background-repeat: no-repeat;
  background-attachment: fixed;
  background-size: cover;
  background-size: 100% 100%;
}
</style>
<title>Insert</title>
</head>
<body>
	<form action="insert" method="post">
		<input type="text" name="vId" placeholder="Vehicle Id" required pattern="[0-9]+$"/>
		<input type="text" name="vName" placeholder="Vehicle Name" required pattern="[a-z A-Z]+$"/>
		<input type="text" name="vType" placeholder="Vehicle Type" required pattern="[a-z A-Z]+$"/>
		<input type="text" name="vNoOfSeats" placeholder="Noseats" required pattern="[0-9]+$"/>
		<input type="text" name="vAcOrNonAc" placeholder="Ac/NonAc" required pattern="[a-z A-Z]+$"/>
		<input type="text" name="vPerKmRate" placeholder="Vehicle PerKmRate" required pattern="[0-9]+$"/>
		<button>Insert</button>
	
		<button><a href="welcome" style=color:black>Home</a></button>
		</form>
</body>
</html>