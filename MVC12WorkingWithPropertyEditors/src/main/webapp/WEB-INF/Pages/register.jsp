<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="frm"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>
	<frm:form method="post" modelAttribute="student">

		<div class="container">
			<div class="header">Student Registration Form</div>

			<div class="row">
				<label class="form-label col-md-2">Enter Name</label>
				<div class="col-md-10">
					<frm:input path="name" class="form-control" />
				</div>
			</div>

			<div class="row">
				<label class="form-label col-md-2">Enter Age</label>
				<div class="col-md-10">
					<frm:input path="age" class="form-control" />
				</div>
			</div>

			<div class="row">
				<label class="form-label col-md-2">Enter Address</label>
				<div class="col-md-10">
					<frm:input path="addr" class="form-control" />
				</div>
			</div>

			<div class="row form-check">
				<label class="form-label col-md-2">Select Gender</label>
				<div class="col-md-10">
					<frm:radiobuttons class="form-check-input" path="gender"
						items="${genders}" />
				</div>
			</div>

			<div class="row">
				<label class="form-label col-md-2">Select Hobbies</label>
				<div class="col-md-10">
					<frm:select class="form-select" path="hobbies" multiple="multiple" >
						<c:forEach var="item" items="${hobbiesList}">
						<frm:option value="${item}"></frm:option>
						</c:forEach>
					</frm:select>
				</div>
			</div>

			<div class="row form-check">
				<label class="form-label col-md-2">Check Colors</label>
				<div class="col-md-10">
					<frm:checkboxes class="form-check-input" path="colors"
						items="${colorsList}" />
				</div>
			</div>
			
			<div class="row">
				<label class="form-label col-md-2">Enter DOB(dd-MM-yyyy)</label>
				<div class="col-md-10">
					<input type="date" class="form-control" name="dob"/>
				</div>
			</div>
			
			<div class="row">
				<label class="form-label col-md-2">Enter DOJ(dd-MM-yyyy)</label>
				<div class="col-md-10">
					<input type="date" class="form-control" name="doj"/>
				</div>
			</div>

			<div class="row">
				<div class="col-md-2">
					<input type="submit" class="btn btn-success" value="Register">
				</div>
				<div class="col-md-2">
					<input type="reset" class="btn btn-primary" value="Reset">
				</div>
			</div>
		</div>
		</div>

	</frm:form>
</body>
</html>