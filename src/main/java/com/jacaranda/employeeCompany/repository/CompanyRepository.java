package com.jacaranda.employeeCompany.repository;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import com.jacaranda.employeeCompany.model.Company;


public interface CompanyRepository extends JpaRepository<Company, Integer> {

	
}