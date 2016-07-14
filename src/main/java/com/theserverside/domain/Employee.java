package com.theserverside.domain;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

	@Entity
	public class Employee {
			
			@Id
			@GeneratedValue(strategy = GenerationType.AUTO)
			private Integer id;
		
		 	private String empid;
		    private String emp_name;
		    private String emp_hire_date;
		    private BigDecimal salary;
		    
			public Integer getId() {
				return id;
			}
			public void setId(Integer id) {
				this.id = id;
			}
			public String getEmpID() {
				return empid;
			}
			public void setEmpID(String empID) {
				empid = empID;
			}
			public String getEmpName() {
				return emp_name;
			}
			public void setEmpName(String empName) {
				emp_name = empName;
			}
			public String getEmpHireDate() {
				return emp_hire_date;
			}
			public void setEmpHireDate(String empHireDate) {
				emp_hire_date = empHireDate;
			}
			public BigDecimal getSalary() {
				return salary;
			}
			public void setSalary(BigDecimal salary) {
				this.salary = salary;
			}

}