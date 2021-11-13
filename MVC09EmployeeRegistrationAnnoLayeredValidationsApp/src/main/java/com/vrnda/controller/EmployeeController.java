package com.vrnda.controller;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.vrnda.dto.Employee;
import com.vrnda.service.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	private EmployeeService service;
	
	@GetMapping({"/","/home"})
	public String homeHandler() {
		return "home";	
	}
	
	@GetMapping("getAllEmployees")
	public String getAllEmployees(Model model) {
		List<Employee> list=null;
		try {
			list=service.getAllEmployees();
		}catch (Exception e) {
			e.printStackTrace();
		}
		model.addAttribute("empList", list);
		return "emplist";
	}
	
	@GetMapping("/register")
	public String registerHandlerGet(@ModelAttribute Employee emp) {
		emp.setId(service.getEmpId());
		return "register";
	}
	
	@PostMapping("/register")
	public String registerHandlerPost(RedirectAttributes redirect,@ModelAttribute Employee emp) {
		Integer retVal=null;
		try {
			retVal=service.saveEmployee(emp);
		}catch (Exception e) {
			e.printStackTrace();
			retVal=0;
		}
		redirect.addFlashAttribute("result",retVal == 1 ? "Record Saved Successfully":"Record Not Saved");
		return "redirect:getAllEmployees";
	}
	
	@GetMapping("/update")
	public String updateGetHandlerGet(@ModelAttribute("emp") Employee emp,@RequestParam Integer id) {
		try {
			Employee employee=service.getEmployeeById(id);
			BeanUtils.copyProperties(employee, emp);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return "update";
	}
	
	@PostMapping("/update")
	public String updateHandlerPost(RedirectAttributes redirect,@ModelAttribute Employee emp) {
		Integer retVal=null;
		try {
			retVal=service.updateEmployee(emp);
		}catch (Exception e) {
			e.printStackTrace();
			retVal=0;
		}
		redirect.addFlashAttribute("result",retVal == 1 ? "Record Updated Successfully":"Record Not Updated");
		return "redirect:getAllEmployees";
	}
	
	@GetMapping("/delete")
	public String deleteHandlerPost(RedirectAttributes redirect,@RequestParam Integer id) {
		Integer retVal=null;
		try {
			retVal=service.deleteEmployee(id);
		}catch (Exception e) {
			e.printStackTrace();
			retVal=0;
		}
		redirect.addFlashAttribute("result",retVal == 1 ? "Record Deleted Successfully":"Record Not Deleted");
		return "redirect:getAllEmployees";
	}
	
	@ModelAttribute("deptNos")
	public List<Integer> getDeptNos(){
		List<Integer> list=null;
		try {
			list=service.getDeptNos();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
}
