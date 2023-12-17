package com.jacaranda.employeeCompany.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jacaranda.employeeCompany.model.Employee;
import com.jacaranda.employeeCompany.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository er;

	public List<Employee> getEmployees() {
		return er.findAll();
	}
	
	public void save(Employee e) {
		er.save(e);
	}
	
	public void edit(Employee employee) {
		save(employee);
	}
}
