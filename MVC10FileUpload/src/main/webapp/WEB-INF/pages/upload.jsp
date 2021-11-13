<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="frm"%>


<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">

</head>
<body>
	<frm:form method="post" class="container form-group btn btn-primary"  modelAttribute="jobSeeker"
		enctype="multipart/form-data">
		<h2  class="form-label">JobSeeker
			Form</h2>
			<div class="row md-3">
				<lable class="col-sm-2 form-label">Enter Name</lable>
				<div class="col-sm-3">`
					<input type="text" name="name" class="form-control">
				</div>
			</div> <br>

			<div class="row mt-5 md-3">
				<lable class="col-sm-2 form-label">Enter Address</lable>
				<div class="col-sm-3">
					<input type="text" name="addr" class="form-control">
				</div>
			</div><br>

			<div class="row md-3">
				<lable class="col-sm-2 form-label">Upload Resume</lable>
				<div class="col-sm-3">
					<input type="file" name="resume" class="form-control form-control-sm">
				</div>
			</div><br>

			<div class="row md-3">
				<lable class="col-sm-2 form-label">Upload Photo</lable>
				<div class="col-sm-3">
					<input type="file" name="photo" class="form-control">
				</div>
			</div><br>

			<div class="row md-3">
				<div class="col-sm-3">
					<input type="submit" value="upload" class="btn btn-success">
				</div>
				<div class="col-sm-3">
					<input type="reset" value="reset" class="btn btn-primary">
				</div>
			</div>
		<!-- 	<table border="2px"  class="table" style="background-color:orange;"> -->
		<%-- 		<tr><td class="text text-primary" >Enter Name::</td><td><frm:input path="name"/></td></tr> --%>
		<%-- 		<tr><td class="text text-primary">Enter Address::</td><td><frm:input path="addr"/></td></tr> --%>
		<!-- 		<tr><td class="text text-primary">Upload Resume::</td><td><input type="file" name="resume"></td></tr> -->
		<!-- 		<tr><td class="text text-primary">Upload Photo::</td><td><input type="file" name="photo"></td></tr> -->
		<!-- 		<tr><td class="text text-primary"><input type="submit" class="btn btn-success" value="Upload"></td><td>&nbsp;<input type="reset" class="btn btn-primary" value="Reset"></td></tr> -->
		<!-- 	</table> -->
	</frm:form>
</body>
</html>