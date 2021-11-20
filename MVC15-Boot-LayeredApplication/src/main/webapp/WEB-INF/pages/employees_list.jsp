<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>
${name}
	${employees}
	<c:choose>
		
		<c:when test="${employees ne null}">

			<c:forEach var="employee" items="${employees}">

				<div class="container">
					<table class="table primary">
						<thead>
							<tr>
								<th>ID</th>
								<th>NAME</th>
								<th>AGE</th>
								<th>SALARY</th>
								<th>DOJ</th>
								<th>Delete</th>
								<th>Update</th>
							</tr>
						</thead>

						<tbody>
							<tr>${employee.id}</tr>
							<tr>${employee.name}</tr>
							<tr>${employee.age}</tr>
							<tr>${employee.salary}</tr>
							<tr>${employee.doj}</tr>
							<tr><a>delete</a></tr>
							<tr><a>update</a></tr>
							
						</tbody>

					</table>

				</div>

			</c:forEach>
		</c:when>

		<c:otherwise>Employees Not Found</c:otherwise>
	</c:choose>



</body>
</html>