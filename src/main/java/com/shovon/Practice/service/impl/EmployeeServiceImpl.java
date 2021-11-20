package com.shovon.Practice.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.shovon.Practice.exception.ResourceNotFoundException;
import com.shovon.Practice.model.Employee;
import com.shovon.Practice.repository.EmployeeRepository;
import com.shovon.Practice.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	private EmployeeRepository employeeRepository; 
	
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employee);
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

	@Override
	public Employee getEmployeeById(long id) {
		// TODO Auto-generated method stub
		return employeeRepository.findById(id).orElseThrow(()->
		                            new ResourceNotFoundException("Employee", "id", id));
	}
	@Override
	public Employee updateEmployeeById(Employee employee, long id) {
		// TODO Auto-generated method stub
		
		Employee exitingEmployee = employeeRepository.findById(id).orElseThrow(()->
        								new ResourceNotFoundException("Employee", "id", id));
		
		exitingEmployee.setFirstName(employee.getFirstName());
		exitingEmployee.setLastName(employee.getLastName());
		exitingEmployee.setEmail(employee.getEmail());
		employeeRepository.save(exitingEmployee);
		
		return exitingEmployee;
		
	}

	@Override
	public void deleteEmployeeById(long id) {
		// TODO Auto-generated method stub
		employeeRepository.findById(id).orElseThrow(()->
        								new ResourceNotFoundException("Employee", "id", id));
		employeeRepository.deleteById(id);
		
	}

}
