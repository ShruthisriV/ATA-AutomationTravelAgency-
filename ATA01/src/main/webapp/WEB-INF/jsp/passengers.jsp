<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymus">
<title>Passengers Table</title>
<style>
body{
background-image: url("https://media.cntraveler.com/photos/6362a4749f831a3191873981/16:9/w_2560%2Cc_limit/GettyImages-1267092594.jpg");
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

 

<th scope="col">Passenger Id</th>

 

<th scope="col">Passenger Name</th>

 

<th scope="col">Age</th>

 

<th scope="col">Mobile Number</th>

 

</tr>

 

</thead>

 

<tbody style="background-color: transparent;">

 

<c:forEach var="pd" items="${pdata}">

 

 <tr scope="row">

 

<td>${pd.pId}</td>

 

<td>${pd.pname}</td>

 

<td>${pd.age}</td>

 

<td>${pd.phoneno}</td>

 

</tr>

 

  </c:forEach>

 

</tbody>

 

</table>

 

   </div>
<center><button><a href="welcome" style=color:black background:transparent>Home</a></button></center> 
</body>
</html>