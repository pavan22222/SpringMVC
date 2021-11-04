<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<body>

	<c:choose>
		<c:when test="${items ne null && !empty items}">
			<c:forEach var="item" items="${items}">
				<b>${item}</b>
			</c:forEach>
		</c:when>

		<c:otherwise>
			<b style="color: red">No Data Found</b>
		</c:otherwise>

	</c:choose>
</body>
</html>