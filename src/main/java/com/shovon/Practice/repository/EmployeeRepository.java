package com.shovon.Practice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shovon.Practice.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{
	

}
