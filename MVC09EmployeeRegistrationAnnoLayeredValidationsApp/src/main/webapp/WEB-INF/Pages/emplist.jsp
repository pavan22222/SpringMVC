<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<body>
	<c:choose>
		<c:when test="${empList ne null and !empty empList }">
			<h2 style="color:green;text-align: center;">Employee Data</h2>
			<table border="2px" bgcolor="pink" align="center">
				<thead>
					<tr>
						<th>ID</th>
						<th>NAME</th>
						<th>AGE</th>
						<th>SALARY</th>
						<th>DOJ</th>
						<th>DNO</th>
						<th>UPDATE</th>
						<th>DELETE</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="emp" items="${empList}">
						<tr>
							<td>${emp.id}</td>
							<td>${emp.name}</td>
							<td>${emp.age}</td>
							<td>${emp.salary}</td>
							<td>${emp.doj}</td>
							<td>${emp.dno}</td>
							<td><a href="./update?id=${emp.id}">update</a></td>
							<td><a href="./delete?id=${emp.id}">delete</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</c:when>
		<c:otherwise>
			<h2>
				<b style="color: red">No Employees are Registered</b>
			</h2>
		</c:otherwise>
	</c:choose>
	
	<br>
	<c:if test="${result ne null}">
		<c:choose>
			<c:when test="${result == 'Record Not Saved'}"><b style="color:red">${result}</b></c:when>
			<c:otherwise><b style="color:green">${result}</b></c:otherwise>
		</c:choose>
		
		
	</c:if>
	<br>
	<a href="./register">Register</a><br>
	<a href="./home">home</a>
</body>
</html>