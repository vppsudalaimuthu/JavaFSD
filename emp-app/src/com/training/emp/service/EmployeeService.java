package com.training.emp.service;

import java.util.ArrayList;
import java.util.Set;
import com.training.emp.exception.EmployeeNotFoundException;
import com.training.emp.model.Employee;

public interface EmployeeService {
	Set<Employee> findAll();

	Employee findById(int id) throws EmployeeNotFoundException;

	void save(Employee employee);

	void update(Employee employee) throws EmployeeNotFoundException;

	void delete(int id) throws EmployeeNotFoundException;
	
	ArrayList<Employee> sortById();
	
	ArrayList<Employee> sortByName();
	
    ArrayList<Employee> listMaxSalaryEmployees();
	
	ArrayList<Employee> listMinSalaryEmployees();

}
