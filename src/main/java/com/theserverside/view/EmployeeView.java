package com.theserverside.view;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.theserverside.domain.Employee;
import com.theserverside.repositories.EmployeeRepository;

@Controller
public class EmployeeView{
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	private Employee employee=new Employee();
	
	public List<Employee> getEmployeeList() {
        return employeeRepository.findAll();
    }
	public void saveEmployee() {
        employeeRepository.save(employee);
        employee = new Employee();
    }
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void deleteEmployee(Employee employee) {
        employeeRepository.delete(employee);
    }
	

}