package com.shovon.Practice.service;

import java.util.List;

import com.shovon.Practice.model.Employee;

public interface EmployeeService {
	Employee saveEmployee(Employee employee);
	List<Employee> getAllEmployees();
	Employee getEmployeeById(long id);
	Employee updateEmployeeById(Employee employee, long id);
	void deleteEmployeeById(long id);
}
