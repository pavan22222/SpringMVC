<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<script type="text/javascript" src="js/validate.js"></script>
</head>
<body>
	<div>
		<form action="validate" method="post" onsubmit="return validate(this)">
			<table>
				<tr>
					<td>Enter UserName::</td>
					<td><input type="text" name="username"></td>
				</tr>
				<tr>
					<td>Enter Password::</td>
					<td><input type="text" name="password"></td>
				</tr>
				<tr>
					<td><input type="submit" style="color: green" value="login"></td>
				</tr>
			</table>
		</form>
		<br>
		<c:choose>
			<c:when test="${result==1}">
				<a href="./register"><b style="color: green">Register_Employee</b></a>
			</c:when>
			<c:when test="${result==0}">
				<b style="color: red">Invalid Credentials</b>
			</c:when>
			<c:when test="${result==2}">
				<b style="color: red">Internal Problem</b>
			</c:when>
		</c:choose>
	</div>
</body>
</html>