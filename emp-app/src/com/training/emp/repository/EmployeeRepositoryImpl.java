package com.training.emp.repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.training.emp.model.Employee;

public class EmployeeRepositoryImpl implements EmployeeRepository {

	// dummy database
	private static Set<Employee> employeeSet = new HashSet<>();

	public EmployeeRepositoryImpl() {
//		employeeSet = new HashSet<>();
		/*
		 * Employee employee1 = new Employee(101, "Immanuel"); Employee employee2 = new
		 * Employee(102, "Saranya"); Employee employee3 = new Employee(103, "Prithivi");
		 * employeeSet.add(employee1); employeeSet.add(employee2);
		 * employeeSet.add(employee3);
		 */

	}

	@Override
	public Set<Employee> findAll() {
		return employeeSet;

	}

	@Override
	public Employee findById(int id) {
		for (Employee employee : employeeSet) {
			if (employee.getId() == id) {
				return employee;
			}
		}
		return null;
	}

	@Override
	public void save(Employee employee) {
		employeeSet.add(employee);
	}

	@Override
	public void update(Employee employee) {
		// emp - exisiting emp
		// employee - new data to be updated
		for (Employee emp : employeeSet) {
			if (emp.getId() == employee.getId()) {
				emp.setName(employee.getName());
			}
		}

	}

	@Override
	public void delete(int id) {
		Iterator<Employee> it = employeeSet.iterator();
		while (it.hasNext()) {
			if (it.next().getId() == id) {
				it.remove();
			}
		}

	}

	@Override
	public ArrayList<Employee> sortById() {
		ArrayList<Employee> empList = new ArrayList<Employee>(employeeSet);
		Collections.sort(empList, Comparator.comparing(Employee::getId).thenComparing(Employee::getName));

		/*
		 * int[] empIDs = new int[employeeSet.size()]; int index = 0;
		 * 
		 * for (Employee emp : employeeSet) { empIDs[index] = emp.getId(); index++; }
		 * 
		 * HashSet<Employee> empSet = new HashSet<>(employeeSet);
		 * 
		 * Arrays.sort(empIDs);
		 * 
		 * for (int i = 0; i < empIDs.length; i++) { for (Employee employee : empSet) {
		 * if (empIDs[i] == employee.getId()) { empList.add(i, employee);
		 * empSet.remove(employee); break; } } }
		 */

		return empList;
	}
	
	@Override
	public ArrayList<Employee> sortByName() {
		
		ArrayList<Employee> empList = new ArrayList<Employee>(employeeSet);
		Collections.sort(empList, Comparator.comparing(Employee::getName).thenComparing(Employee::getId));

		return empList;
	}

}
