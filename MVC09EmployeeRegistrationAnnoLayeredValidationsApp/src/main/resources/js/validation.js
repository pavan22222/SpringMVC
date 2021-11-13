function validate(frm){
	var flag=true;
	var vflag=true;
	let name=frm.name.value;
	let age=frm.age.value;
	let salary=frm.salary.value;
	let doj=frm.doj.value;
	alert('Hello');
	console.log("Pavan");
	alert("HI")
	document.getElementById("nameId").innerHTML="";
	document.getElementById("ageId").innerHTML="";
	document.getElementById("salaryId").innerHTML="";
	document.getElementById('dojId').innerHTML="";
	
	if(name == null){
		flag=false;
		document.document.getElementById("nameId").innerHTML="Name must be entered";
	}
	
	if(name.length > 20){
		flag=false;
		document.document.getElementById("nameId").innerHTML="Name length must be between 0 to 20";
	}
	
	if(age == null){
		flag=false;
		document.document.getElementById("ageId").innerHTML="Age must be entered";
	}
	
	if(age < 0 || age > 120){
		flag=false;
		document.document.getElementById("ageId").innerHTML="Age must be between 0 to 120";
	}
	
	if(salary == null){
		flag=false;
		document.document.getElementById("salaryId").innerHTML="Salary must be entered";
	}
	
	if(doj == null || doj == ""){
		flag=false;
		document.document.getElementById("salaryId").innerHTML="DOJ must be entered";
	}
	
	return flag;
		
}