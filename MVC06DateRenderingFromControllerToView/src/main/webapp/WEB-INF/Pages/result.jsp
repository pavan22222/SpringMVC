<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<body>
	<c:choose>
		<c:when test="${result > 0}">
			<h2 style="color: green; text-align: center;">Record Saved</h2>
		</c:when>
		<c:otherwise>
			Record Not Saved
		</c:otherwise>
	</c:choose>
	<br>
	<h3>
		<h2 style="color: red; text-align: center;"><a href="./getEmployees"><b>Get Employees</b></a></h2>
	</h3>
</body>
</html>