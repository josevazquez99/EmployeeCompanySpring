package com.jacaranda.employeeCompany.model;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;

@Entity
@Table(name = "employeeProject")
public class EmployeeProject {
	@Id
	@ManyToOne
	@JoinColumn(name = "idEmployee")
	private Employee idEmployee;

	@Id
	@ManyToOne
	@JoinColumn(name ="idProject")
	private Project idProject;
	
	
	@Min(0)
	private Integer minute;

	public Employee getIdEmployee() {
		return idEmployee;
	}

	public void setIdEmployee(Employee idEmployee) {
		this.idEmployee = idEmployee;
	}

	public Project getIdProject() {
		return idProject;
	}

	public void setIdProject(Project idProject) {
		this.idProject = idProject;
	}

	public Integer getMinute() {
		return minute;
	}

	public void setMinute(Integer minute) {
		this.minute = minute;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idEmployee, idProject, minute);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeProject other = (EmployeeProject) obj;
		return Objects.equals(idEmployee, other.idEmployee) && Objects.equals(idProject, other.idProject)
				&& Objects.equals(minute, other.minute);
	}
	
	



}