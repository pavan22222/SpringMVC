<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="frm"%>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<body>
	<frm:form action="update" method="post" modelAttribute="emp">
		<div
			style="border: solid 2px green; width: 400px; height: 210px; background-color: pink">
			<div style="color: green; font-size: 20px; text-align: center">Update
				Form</div>
			<br> <label style="padding: 10px; font-weight: bold;">Enter
				Id</label>
			<frm:input path="id" readonly="true" />
			<br> <label style="padding: 10px; font-weight: bold;">Enter
				Name</label>
			<frm:input path="name" />
			<br> <label style="padding: 10px; font-weight: bold;">Enter
				Age</label>
			<frm:input path="age" />
			<br> <label style="padding: 10px; font-weight: bold;">Enter
				Salary</label>
			<frm:input path="salary" />
			<!-- 			<br> <label style="padding: 10px; font-weight: bold;">Enter
			<frm:input readonly="true" path="doj" />  -->
			<br> <label style="padding: 10px; font-weight: bold;">Select
				Department</label>
			<frm:select path="dno">
				<br>
				<frm:options items="${deptNos}"></frm:options>
			</frm:select>
			<br> &nbsp<input
				style="padding: 10px; width: 60px; background-color: green"
				" type="submit" value="Update">&nbsp;&nbsp;<input
				style="padding: 10px; width: 60px; background-color: red"
				type="reset" value="Reset">
		</div>
	</frm:form>
</body>
</html>