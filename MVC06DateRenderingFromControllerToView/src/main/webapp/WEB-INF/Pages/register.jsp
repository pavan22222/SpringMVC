<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="frm" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<body>
	<frm:form action="register" method="POST" modelAttribute="empForm">
		<table align="center">
			<tbody>
				<tr>
					<th>Enter Name</th>
					<th>Enter Age</th>
					<th>Enter Salary</th>
				</tr>
				<tr>
					<td><frm:input path="name" /><td>
					<td><frm:input path="age" /></td>
					<td><frm:input path="salary" /></td>
				</tr>
				<tr>
					<td><input
						style="width: 100px; background-color: blue; text-align: center; color: white"
						type="submit" value="save">
					</td>
				</tr>
			</tbody>
		</table>


	</frm:form>
</body>
</html>