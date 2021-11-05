<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<head>
<script lang="text/javascript">
	function doPrint() {
		frames.focus();
		frames.print();
	}
</script>
</head>
<html>
<body>
	<c:choose>
		<c:when test="${empList ne null &&  !empty empList}">
			<table bgcolor="cyan" align="center" border="1">
				<tr>
					<th>ID</th>
					<th>NAME</th>
					<th>AGE</th>
					<th>SALARY</th>
					<th>DOJ</th>
				</tr>
				<c:forEach var="emp" items="${empList}">
					<tr>
						<td>${emp.id}</td>
						<td>${emp.name}</td>
						<td>${emp.age}</td>
						<td>${emp.salary}</td>
						<td>${emp.doj}</td>
					</tr>

				</c:forEach>
			</table>
		</c:when>
		<c:otherwise>
			<b>No Data Found</b>
		</c:otherwise>
	</c:choose>
	
	<a href="JavaScript:doPrint()" style="color:red;text-align="center">Print</a>

</body>
</html>