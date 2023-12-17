package com.jacaranda.employeeCompany.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import com.jacaranda.employeeCompany.model.Company;
import com.jacaranda.employeeCompany.model.Employee;
import com.jacaranda.employeeCompany.service.CompanyService;
import com.jacaranda.employeeCompany.service.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;
	
	@Autowired
	CompanyService companyService;
	
	@GetMapping("/employee/listEmployees")
	public String listEmployees(Model model) {
		List<Employee> listEmployees = employeeService.getEmployees();
		model.addAttribute("listEmployees", listEmployees);
		return "/employee/listEmployees";
	}
	
	@GetMapping("/employee/addEmployee")
	public String addEmployee(Model model) {
		Employee employee = new Employee();
		model.addAttribute("employee", employee);
		
		List<Company> companies = companyService.getCompanies();
		model.addAttribute("companies", companies);

		return "/employee/addEmployee";
	}
	
	@GetMapping("/employee/saveEmployee")
	public String saveEmployee(Model model,@ModelAttribute("employee") Employee employeeSave) {
		employeeService.save(employeeSave);
		model.addAttribute("add", "Empleado añadido con éxito");
		
		Employee employee = new Employee();
		model.addAttribute("employee", employee);
		
		return "/employee/addEmployee";
	}
	
	@GetMapping("/employee/editEmployee")
	public String editEmployee(Model model,@RequestParam("id") Employee employee) {
		model.addAttribute("employee", employee);
		List<Company> companies = companyService.getCompanies();
		model.addAttribute("companies", companies);
		
		return "/employee/editEmployee";
	}
	
	@GetMapping("/employee/editEmployeeConfirm")
	public String editEmployeeConfirm(Model model,@ModelAttribute("employee") Employee employeeEdit) {
		model.addAttribute("employee", employeeEdit);
		employeeService.edit(employeeEdit);
		model.addAttribute("edit","Empleado editado correctamente");
		List<Company> companies = companyService.getCompanies();
		model.addAttribute("companies", companies);
		
		return "/employee/editEmployee";
	}
	
}