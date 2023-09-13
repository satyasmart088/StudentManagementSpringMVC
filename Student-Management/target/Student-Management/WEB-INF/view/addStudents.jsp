<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="/resourceHandler/students.css">
<title>Add Students</title>
</head>
<body>
<div align="center">
<h1>Add Students</h1>


<form:form action="saveStudents" modelAttribute="student" method="POST">

<form:hidden path="id" />

<p>
<label for="fn">First Name :</label>
<form:input path="first_name" id="fn"/>
</p>
<p>
<label for="ln">Last Name :</label>
<form:input path="last_name" id="ln"/>
</p>
<p>
<label for="m">Mobile :</label>
<form:input path="mobile" id="m"/>
</p>
<p>
<label for="e">Email :</label>
<form:input path="email" id="e"/>
</p>
<p>
<label for="a">Address :</label>
<form:input path="address" id="a"/>
</p>
<input type="submit" value="Submit">
</form:form>
</div>

</body>
</html>