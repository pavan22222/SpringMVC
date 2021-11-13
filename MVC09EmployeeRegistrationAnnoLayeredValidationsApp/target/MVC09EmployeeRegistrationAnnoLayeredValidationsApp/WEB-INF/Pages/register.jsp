<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="frm"%>
<!DOCTYPE html>

<head>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<script type="text/javascript" src="/js/validation.js"></script>
</head>
<html>
<body>
	<frm:form class="container" action="register" method="post" modelAttribute="employee" onsubmit="return validate(this)">
		<div
			style="border: solid 2px green; width: 400px; height: 400px; background-color: lime;">
			<div style="color: red; font-size: 20px; text-align: center">Register
				Form</div>
			<br> <label style="padding: 10px; font-weight: bold;">Enter
				Id</label>
			<frm:input path="id" readonly="true" />
			<br> <label style="padding: 10px; font-weight: bold;">Enter
				Name</label>
			<frm:input path="name" /><span id="nameId"></span>
			<br> <label style="padding: 10px; font-weight: bold;">Enter
				Age</label>
			<frm:input path="age" /><span id="ageId"></span>
			<br> <label style="padding: 10px; font-weight: bold;">Enter
				Salary</label>
			<frm:input path="salary" /><span id="salaryId"></span>
			<br> <label style="padding: 10px; font-weight: bold;">Enter
				DOJ</label><span id="dojId"></span>
			<frm:input path="doj" />
			<br> <label style="padding: 10px; font-weight: bold;">Select
				Department</label>
			<frm:select path="dno">
				<br>
				<frm:options items="${deptNos}"></frm:options>
			</frm:select>
			<br> &nbsp<input
				style="padding: 10px; width: 60px; background-color: blue"
				" type="submit" value="Save">&nbsp;&nbsp;<input
				style="padding: 10px; width: 60px; background-color: red"
				type="reset" value="Reset">
		</div>
	</frm:form>
</body>
</html>