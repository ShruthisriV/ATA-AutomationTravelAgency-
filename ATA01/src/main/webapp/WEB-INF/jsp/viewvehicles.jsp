<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymus">
<title>Vehicle Details</title>

<body>
<title>table</title>
<style>
body{
background-image: url("https://wallpapers.com/images/hd/travel-4k-city-sky-a8zpxdogdzw3d9da.jpg");
background-attachment:fixed;
background-repeat: no-repeat;
background-size: cover;
background-size: 100% 100%;
}
table{
border-collapse: collapse;
width: 100%;

}
th,td{

border: 2px solid black;
padding: 15px;
}
you{
color:white;
}
</style>
</head>
	<table>
	<tr class=you>
		<th>Vehicle Id</th>
		<th>Vehicle Type</th>
		<th>Vehicle Name</th>
		<th>No. of Seats</th>
		<th>Ac/NonAc</th>
		<th>vPerKmRate</th>
		<th>update vehicle</th>
		<th>delete</th>
	</tr>
	<c:forEach items="${view}" var="views">
	<tr>
	<td>${views.vId}</td>
	<td>${views.vName}</td>
	<td>${views.vType}</td>
	<td>${views.vNoOfSeats}</td>
	<td>${views.vAcOrNonAc}</td>
	<td>${views.vPerKmRate}</td>
	<td>
	<a href="update?vId=${views.vId}">update</a>
	</td>
	<td>
	<a onclick="return confirm('Do you want to delete this record')" href="delete?vId=${views.vId}">delete</a></td>
	</tr>
	</c:forEach>
</table><br>


<center><button><a href="welcome" style=color:black background:transparent>Back</a></button></center>
</body>
</html>