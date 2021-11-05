<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="frm" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<body>
	<frm:form action="register" method="POST" modelAttribute="empForm">
		<frm:textarea path="name"/>
		<frm:input path="age"/>
		<frm:input path="salary"/>
		<input type="submit" value="save">
	</frm:form>
</body>
</html>