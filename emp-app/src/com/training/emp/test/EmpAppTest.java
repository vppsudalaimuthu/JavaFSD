package com.training.emp.test;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;

import com.training.emp.exception.EmployeeNotFoundException;
import com.training.emp.model.Employee;
import com.training.emp.service.EmployeeService;
import com.training.emp.service.EmployeeServiceImpl;

public class EmpAppTest {

	static Scanner userInput = new Scanner(System.in);
	
	private static void doMenuOperation(int menuOption) {
		
		EmployeeService empService = new EmployeeServiceImpl();

		switch (menuOption) {
		case 1:
			Set<Employee> allEmps = empService.findAll();
			if (allEmps.size() == 0) {
				System.out.println("Employees are not found in your database");
			}

			for (Employee employee : allEmps) {
				System.out.println(employee);
			}

			break;
		case 2:
			System.out.print("Enter Employee Id:");
			int empId = userInput.nextInt();
			Employee employee;
			try {
				employee = empService.findById(empId);
				System.out.println(employee);
			} catch (EmployeeNotFoundException e) {
				System.out.println(e.getMessage());
			}

			break;
		case 3:
			System.out.print("Enter Employee Id:");
			int newEmpId = userInput.nextInt();
			userInput.nextLine();
			System.out.print("Enter Employee Name:");
			String newEmpName = userInput.nextLine();

			Employee newEmp = new Employee(newEmpId, newEmpName);
			empService.save(newEmp);
			System.out.println("New Employee is created successfully.");

			break;
		case 4:
			System.out.print("Enter employee Id to be edited:");
			int editEmpId = userInput.nextInt();
			userInput.nextLine();
			System.out.print("Enter the modified/new name of selected employee:");
			String editEmpName = userInput.nextLine();

			Employee editEmp = new Employee(editEmpId, editEmpName);

			try {
				empService.update(editEmp);
				System.out.println("Employee details are edited successfully.");
			} catch (EmployeeNotFoundException e) {
				// e.printStackTrace();
				System.out.println(e.getMessage());
			}

			break;
		case 5:
			System.out.print("Enter Employee Id:");
			int delEmpId = userInput.nextInt();

			try {
				empService.delete(delEmpId);
				System.out.println("Employee is deleted successfully.");
			} catch (EmployeeNotFoundException e) {
				// e.printStackTrace();
				System.out.println(e.getMessage());
			}

			break;
			
		case 6:
			ArrayList<Employee> empList = empService.sortById();
			
			if (empList.size() == 0) {
				System.out.println("Employees are not found in your database");
			}

			for (Employee emp : empList) {
				System.out.println(emp);
			}

			break;
			
		case 7:
			ArrayList<Employee> employeeList = empService.sortByName();
			
			if (employeeList.size() == 0) {
				System.out.println("Employees are not found in your database");
			}

			for (Employee emp : employeeList) {
				System.out.println(emp);
			}

			break;
			
		default:
			System.out.println("Invalid Option");
			break;
		}

	}

	public static void main(String[] args) {

		System.out.println("Employee Application Menu List");
		System.out.println("-------------------------------");
		System.out.println("1 -> List all employees");
		System.out.println("2 -> Find Employee By ID");
		System.out.println("3 -> Create New Employee");
		System.out.println("4 -> Edit Existing Employee");
		System.out.println("5 -> Delete Employee");
		System.out.println("6 -> Sort Employees By ID");
		System.out.println("7 -> Sort Employees By Name");
		System.out.println("0 -> Exit");
		System.out.println("-------------------------------");

		System.out.println("Select any one of the option....");
		int menuOption = userInput.nextInt();
		
		while (menuOption > 0) {
			
			doMenuOperation(menuOption);
			System.out.println("Select any option to continue..otherwise press 0 to exit");
			menuOption = userInput.nextInt();
			
		}
		
		System.out.println("Exit Successfully.");

		userInput.close();
	}

}
