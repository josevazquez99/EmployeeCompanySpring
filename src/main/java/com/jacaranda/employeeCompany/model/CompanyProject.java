package com.jacaranda.employeeCompany.model;

import java.sql.Date;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "companyProject")
public class CompanyProject {
	
	
	@Id
	@ManyToOne
	@JoinColumn(name = "idCompany")
	private Company idCompany;
	
	@Id
	@ManyToOne
	@JoinColumn(name = "idProject")
	private Project idProject;
	
	
	private Date begin;
	private Date end;
	public Company getIdCompany() {
		return idCompany;
	}
	public void setIdCompany(Company idCompany) {
		this.idCompany = idCompany;
	}
	public Project getIdProject() {
		return idProject;
	}
	public void setIdProject(Project idProject) {
		this.idProject = idProject;
	}
	public Date getBegin() {
		return begin;
	}
	public void setBegin(Date begin) {
		this.begin = begin;
	}
	public Date getEnd() {
		return end;
	}
	public void setEnd(Date end) {
		this.end = end;
	}
	@Override
	public int hashCode() {
		return Objects.hash(begin, end, idCompany, idProject);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CompanyProject other = (CompanyProject) obj;
		return Objects.equals(begin, other.begin) && Objects.equals(end, other.end)
				&& Objects.equals(idCompany, other.idCompany) && Objects.equals(idProject, other.idProject);
	}
	
	

}
