<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="/Student-Management/resourceHandler/students.css">
<title>Students DeskBoard</title>
</head>
<body>

<div align="center">

<h1>Students Management</h1>

<h1>Students List</h1>

<nav>
<form action="addStudents" method="GET">
<input type="submit" value="Add" />

</form>
</nav>
<table border="1px">
	<thead>
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
				<td><a href="/Student-Management/updateStudent?userId=${student.id}">Update</a></td>
				<td><a href="/Student-Management/deleteStudent?userId=${student.id}">Delete</a></td>
				
				
			</tr>
			
			</c:forEach>
		
		
</table>

</div>
</body>
</html>