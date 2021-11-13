<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<body>
	<div>
		<table>
			<tr><td>Enter UserName::</td><td><input type="text" name="username"></td></tr>
			<tr><td>Enter Password::</td><td><input type="text" name="password"></td></tr>
		</table>
		
		<c:if test="${result ne null && result == 1}">
			<a href="./register"><b style="color:green">Register_Employee</b></a>
		</c:if>
		<c:if test="${result ne null && result == 0 }">
			<b style="color:red">Invalid Credentials</b>
		</c:if>
		<c:if test="${result == 2 }">
			<b style="color:red">Internal Problem</b>
		</c:if>
		
	</div>
</body>
</html>