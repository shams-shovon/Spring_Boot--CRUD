package com.shovon.Practice.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shovon.Practice.model.Employee;
import com.shovon.Practice.service.EmployeeService;
import com.shovon.Practice.service.impl.EmployeeServiceImpl;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
	@Autowired
	private EmployeeServiceImpl employeeServiceImpl;

	
	
	@PostMapping()
	public String saveEmployee(@RequestBody Employee employee){
		
		employeeServiceImpl.saveEmployee(employee);

		return "Hello";
		
	}
	
	@GetMapping
	public List<Employee> getAllEmployees(){
		return employeeServiceImpl.getAllEmployees(); 
	}
	
	@GetMapping("{id}")
	public Employee getEmployeeById(@PathVariable("id") long id) {
		return employeeServiceImpl.getEmployeeById(id);
	}
	
	@PutMapping("{id}")
	public Employee updateEmployeeById(@PathVariable("id") long id, 
			@RequestBody Employee employee) {
		
		return employeeServiceImpl.updateEmployeeById(employee, id);
	}
	
	@DeleteMapping("{id}")
	public String deleteEmployeeById(@PathVariable("id") long id) {
		employeeServiceImpl.deleteEmployeeById(id);
		return "Successfully delete";
	}

}
