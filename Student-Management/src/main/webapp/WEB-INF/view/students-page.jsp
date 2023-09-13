<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="/Student-Management/resourceHandler/students.css">
<title>Students DeskBoard</title>
</head>
<body>


<div align="center">

<h1>Students Management</h1>

<h1>Students List</h1>

<nav>
<form action="addStudents" method="GET" class="form-group">
<input type="submit" value="Add" />

</form>
</nav>
<table class="table">
	<thead class="thead-light">
		<tr>
			<td>Id</td>
			<td>Name</td>
			<td>Mobile</td>
			<td>Email</td>
			<td>Address</td>
			
		</tr>
	
	</thead>
	
		
		
			<c:forEach var="student" items="${student}">
			<tr>
				<td>${student.id}</td>
				<td>${student.first_name} ${student.last_name}</td>
				<td>${student.mobile}</td>
				<td>${student.email}</td>
				<td>${student.address}</td>
				<td><a class="btn btn-primary" data-toggle="collapse" href="/Student-Management/updateStudent?userId=${student.id}">Update</a></td>
				<td><a class="btn btn-primary" data-toggle="collapse" href="/Student-Management/deleteStudent?userId=${student.id}">Delete</a></td>
				
				
			</tr>
			
			</c:forEach>
		
		
</table>

</div>
</body>
</html>