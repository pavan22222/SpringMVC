<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="frm" %>
    
    
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	
</head>
<body>
	<ol class="row,container btn btn-primary">
		<li>${resumeFileName}</li>
		<li>${photoFileName}</li>
	</ol>
	
	<a href="./upload"><input type="button" value="Back" class="btn btn-secondary" ></a>
</body>
</html>