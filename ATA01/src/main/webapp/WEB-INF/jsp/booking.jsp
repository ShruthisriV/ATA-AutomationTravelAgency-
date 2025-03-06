<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymus">
<title>booking details</title>
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
</style>
</head>
<body>
	<div>

 <table class="table">

<thead class="thead-dark">

<tr>

<th scope="col">bId</th>

<th scope="col">pId</th>

<th scope="col">routeId </th>

<th scope="col">dateoftravel</th>

<th scope="col">dateofbooking</th>

<th scope="col">ratetopay</th>

 

</tr>

</thead>

 

<tbody style="background-color:transparent;">

 

<c:forEach var="bd" items="${bdata}">

 

 <tr scope="row">

 

<td>${bd.bId}</td>

 

<td>${bd.pId}</td>

 

<td>${bd.routeId}</td>

 

<td>${bd.dateoftravel}</td>

<td>${bd.dateofbooking}</td>

<td>${bd.ratetopay}</td>

 

 

</tr>

 

  </c:forEach>

 

</tbody>

 

</table>

 

   </div> 
<center><button><a href="welcome" style=color:black background:transparent>Home</a></button></center>
</body>
</html>