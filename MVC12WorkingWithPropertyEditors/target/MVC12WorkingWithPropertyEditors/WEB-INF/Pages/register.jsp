<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="frm" %>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>
	<frm:form method="post" modelAttribute="student">
	
	<div class="container">
		<div class="header">Student Registration Form</div>
		
		<div class="row">
			<label class="form-label col-md-2">Enter Name</label>
			<div class="col-md-3">
				<frm:input path="name" class="form-control"/>
			</div>
		</div>
		
		<div class="row">
			<label class="form-label col-md-2">Enter Age</label>
			<div class="col-md-3">
				<frm:input path="age" class="form-control"/>
			</div>
		</div>
		
		<div class="row">
			<label class="form-label col-md-2">Enter Address</label>
			<div class="col-md-3">
				<frm:input path="addr" class="form-control"/>
			</div>
		</div>
		
		<div class="row">
			<label class="form-label col-md-2">Select Gender</label>
			<div class="col-md-3">
				<frm:radiobuttons  class="form-control" path="gender" items="${genders}"/>
			</div>
		</div>
		
		<div class="row">
			<label class="form-label col-md-2">Check Hobbies</label>
			<div class="col-md-3">
				<frm:select path="hobbies" class="form-control" multiple="multiple">
					<frm:options items="${hobbiesList}"/>
				</frm:select>
			</div>
		</div>
		
		<div class="row">
			<label class="form-label col-md-2">Select Colors</label>
			<div class="col-md-3">
				<frm:checkboxes class="form-control" path="colors" items="${colorsList}"/>
			</div>
		</div>
		
		<div class="row">
			<div class="col-md-2">
				<input type="submit" value="Register">
			</div>
			
			<div class="col-md-2">
				<input type="reset" value="Reset">
			</div>
		</div>
	</div>	
	
	</frm:form>
</body>
</html>