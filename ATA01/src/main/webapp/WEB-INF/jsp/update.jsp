<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Update details</title>
	
</head>
<style>
body{
background-image: url("https://wallpapercosmos.com/w/full/5/c/0/1299526-2048x1238-desktop-hd-cruiser-ship-background.jpg");
background-attachment: fixed;
background-size: cover;
background-size: 100% 100%;
background-repeat: no-repeat;
}
</style>
<body>
	<form action="update" method="post">
		<input type="text" name="vId" value="${v1.vId}" readonly pattern="[0-9]+$">
		<input type="text" name="vName" value="${v1.vName}" required pattern="[a-z A-Z]+$">
		<input type="text" name="vType" value="${v1.vType}" required pattern="[a-z A-Z]+$">
		<input type="text" name="vNoOfSeats" value="${v1.vNoOfSeats}" required pattern="[0-9]+$">
		<input type="text" name="vAcOrNonAc" value="${v1.vAcOrNonAc}" required pattern="[a-z A-Z]+$">
		<input type="text" name="vPerKmRate" value="${v1.vPerKmRate}" required pattern="[0-9]+$">
		<input type="submit" >
	</form>	
</body>
</html>