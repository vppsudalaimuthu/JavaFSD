package com.training.emp.test;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

import com.training.emp.model.Employee;
import com.training.emp.repository.EmployeeRepository;
import com.training.emp.repository.EmployeeRepositoryImpl;

public class EmployeeRepositoryTest {
	public static void main(String[] args) {
		
		System.out.println("Find All Employees");
		EmployeeRepository repository = new EmployeeRepositoryImpl();
		Set<Employee> resultSet = repository.findAll();
		System.out.println(resultSet);

		System.out.println("Find By Id");
		int id = 103;
		Employee resultEmployee = repository.findById(id);
		System.out.println(resultEmployee);

		System.out.println("Adding an employee");
		Employee newEmployee = new Employee(104, "Roopa");
		repository.save(newEmployee);
		resultSet = repository.findAll();
		System.out.println(resultSet);

		System.out.println("Updating an employee");
		Employee updateEmployee = new Employee(104, "RoopaR");
		repository.update(updateEmployee);
		resultSet = repository.findAll();
		System.out.println(resultSet);

		System.out.println("Delete By Id");
		id = 103;
		repository.delete(id);
		resultSet = repository.findAll();
		System.out.println(resultSet);

		System.out.println("Sort Employees By ID");
		//add new employee for test data
		newEmployee = new Employee(100, "Puja");
		repository.save(newEmployee);
		//sort employees by id
		ArrayList<Employee> empList = repository.sortById();
		System.out.println(empList);
		
		System.out.println("Sort Employees By Name");
		//add new employee for test data
		newEmployee = new Employee(106, "Raja");
		repository.save(newEmployee);
		
		//sort employees by name
		empList = repository.sortByName();
		System.out.println(empList);
	}
}
