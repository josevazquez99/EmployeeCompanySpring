package com.jacaranda.employeeCompany.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jacaranda.employeeCompany.model.Company;
import com.jacaranda.employeeCompany.repository.CompanyRepository;

@Service
public class CompanyService {

	@Autowired
	private CompanyRepository cr;

	public List<Company> getCompanies() {
		return cr.findAll();
	}
	
	public void addCompany(Company c) {
		cr.save(c);
	}
	
	public void deleteCompany(Company c) {
		cr.delete(c);
	}

}