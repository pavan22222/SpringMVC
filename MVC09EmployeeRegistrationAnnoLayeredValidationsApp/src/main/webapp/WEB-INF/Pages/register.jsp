<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="frm"%>
<!DOCTYPE html>

<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script language="JavaScript">
function validate(frm){
	var flag=true;
	var vflag=true;
	console.log(frm.id.value);
	let name=frm.name.value;
	let age=frm.age.value;
	let salary=frm.salary.value;
	let doj=frm.doj.value;
	console.log(frm.id.value);
	document.getElementById("nameId").innerHTML="";
	document.getElementById("ageId").innerHTML="";
	document.getElementById("salaryId").innerHTML="";
	document.getElementById('dojId').innerHTML="";
	if(name == ""){
		flag=false;
		document.getElementById("nameId").innerHTML="Name must be entered";
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
	
	if(doj == ""){
		flag=false;
		document.getElementById("dojId").innerHTML="DOJ must be entered";
	} 
	
	return flag;
		
}
</script>
</head>
<html>
<body>
	<frm:form class="container" action="register" method="post"
		modelAttribute="employee" onsubmit="return validate(this)">
		<div
			style="border: solid 2px green; width: 600px; height: 400px; background-color: lime;">

			<div style="color: red; font-size: 20px; text-align: center">Register
				Form</div>
			<br> <label style="padding: 10px; font-weight: bold;">Enter
				Id</label>
			<frm:input path="id" readonly="true" />
			<br> <label style="padding: 10px; font-weight: bold;">Enter
				Name</label>
			<frm:input path="name" />
			<span id="nameId" class="text text-danger"></span> <br> <label
				style="padding: 10px; font-weight: bold;">Enter Age</label>
			<frm:input path="age" />
			<span id="ageId" class="text text-danger"></span> <br> <label
				style="padding: 10px; font-weight: bold;">Enter Salary</label>
			<frm:input path="salary" />
			<span id="salaryId" class="text text-danger"></span> <br> <label
				style="padding: 10px; font-weight: bold;">Enter DOJ</label>
			<frm:input path="doj" />
			<span class="text text-danger" id="dojId"></span> <br> <label
				style="padding: 10px; font-weight: bold;">Select Department</label>
			<frm:select path="dno">
				<br>
				<frm:options items="${deptNos}"></frm:options>
			</frm:select>
			<br> &nbsp;&nbsp;<input class="btn btn-success" type="submit" value="Save">&nbsp;&nbsp;<input
				class="btn btn-secondary" type="reset" value="Reset">
		</div>
	</frm:form>
</body>
</html>