<%@page import="jdk.jfr.Percentage"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	
</head>
<body>
	<c:choose>
		<c:when test="${files ne null and !empty files }">
			<div class="form-group row container btn btn-success">
					<label class="col-lg-4 form-sub-header text text-warning">Files</label>
					<div class="col-md-3 form-header text text-warning">Download Link</a></div>
					
				</div>
			<c:forEach var="file" items="${files}">
				<div class="form-group row container btn btn-default">
					<label class="col-md-4 form-label">${file}</label>
					<div class="col-md-3"><a class="form-control-plaintext" href="./download?fileName=${file}">Download</a></div>
					
				</div>
			</c:forEach>
		</c:when>
	</c:choose>
</body>
</html>