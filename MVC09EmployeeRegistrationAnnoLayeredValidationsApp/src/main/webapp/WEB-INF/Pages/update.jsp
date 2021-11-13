<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="frm"%>

<!DOCTYPE html>
<html>

<script lang="text/javascript">
	function validate(frm){
		var flag=true;
		var vflag=true;
		let name=frm.name.value;
		let age=frm.age.value;
		let salary=frm.salary.value;
		document.getElementById("nameId").innerHTML="";
		document.getElementById("ageId").innerHTML="";
		document.getElementById("salaryId").innerHTML="";
		
		if(name == ""){
			flag=false;
			document.getElementById("nameId").innerHTML="";
		}
		
		if(name.length > 20){
			flag=false;
			document.getElementById("nameId").innerHTML="Name length must be between 0 to 20";
		}
		
		if(age == ""){
			flag=false;
			document.getElementById("ageId").innerHTML="Age must be entered";
		}
		
		if(age < 0 || age > 120){
			flag=false;
			document.getElementById("ageId").innerHTML="Age must be between 0 to 120";
		}
		
		if(salary == ""){
			flag=false;
			document.getElementById("salaryId").innerHTML="Salary must be entered";
		}
		return flag;
	}

</script>

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<body>
	<frm:form class="container" action="update" method="post" modelAttribute="emp" onsubmit="return validate(this)">
		<div
			style="border: solid 2px green; width: 600px; height: 400px; background-color: pink">
			<div style="color: green; font-size: 20px; text-align: center">Update
				Form</div>
			<br> <label style="padding: 10px; font-weight: bold;">Enter
				Id</label>
			<frm:input path="id" readonly="true" />
			<br> <label style="padding: 10px; font-weight: bold;">Enter
				Name</label>
			<frm:input path="name" /><span class="text text-danger" id="nameId"></span>
			<br> <label style="padding: 10px; font-weight: bold;">Enter
				Age</label>
			<frm:input path="age" /><span class="text text-danger" id="ageId"></span>
			<br> <label style="padding: 10px; font-weight: bold;">Enter
				Salary</label>
			<frm:input path="salary" /><span class="text text-danger" id="salaryId"></span>
			<!-- 			<br> <label style="padding: 10px; font-weight: bold;">Enter
			<frm:input readonly="true" path="doj" />  -->
			<br> <label style="padding: 10px; font-weight: bold;">Select
				Department</label>
			<frm:select path="dno">
				<br>
				<frm:options items="${deptNos}"></frm:options>
			</frm:select>
			<br>&nbsp;&nbsp; <input type="submit" class="btn btn-primary"value="Update">&nbsp;<input type="reset"
				class="btn btn-secondary" value="Reset">
		</div>
	</frm:form>
</body>
</html>