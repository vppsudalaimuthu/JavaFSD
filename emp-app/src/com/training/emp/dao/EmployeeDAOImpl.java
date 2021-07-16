package com.training.emp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

import com.training.emp.model.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {

	private static Connection con;
	private static PreparedStatement pstmt;
	private static ResultSet rs;
	private static Set<Employee> employeeSet;

	public EmployeeDAOImpl() {
		try {
			//Class.forName("oracle.jdbc.driver.OracleDriver");
			Class.forName("com.mysql.jdbc.Driver");
			//con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "root", "password");
		      con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp_db","root","sa");
		     // con = DriverManager.getConnection("jdbc:mysql://(host=localhost,port=3306,useSSL=true)/emp_db","root","sa");
		      
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public Set<Employee> findAll() {
		try {
			pstmt = con.prepareStatement("select * from employee_info");
			rs = pstmt.executeQuery();
			employeeSet = new HashSet<>();
			while (rs.next()) {
				Employee employee = new Employee(rs.getInt("id"), rs.getString("name"), rs.getFloat("salary"));
				employeeSet.add(employee);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (rs!=null) {
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (pstmt!=null) {
				
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (con!=null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return employeeSet;
	}

	@Override
	public Employee findById(int id) {
		Employee employee = null;
		try {
			pstmt = con.prepareStatement("select * from employee_info where id=?");
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				employee = new Employee(rs.getInt("id"), rs.getString("name"), rs.getFloat("salary"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return employee;
	}

	@Override
	public void save(Employee employee) {
		try {
			pstmt = con.prepareStatement("insert into employee_info values(?,?,?)");
			pstmt.setInt(1, employee.getId());
			pstmt.setString(2, employee.getName());
			pstmt.setFloat(3, employee.getSalary());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void update(Employee employee) {
		try {
			pstmt = con.prepareStatement("update employee_info set name=? where id=?");
			pstmt.setString(1, employee.getName());
			pstmt.setInt(2, employee.getId());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void delete(int id) {
		try {
			pstmt = con.prepareStatement("delete employee_info where id=?");
			pstmt.setInt(1, id);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	
	@Override
	public ArrayList<Employee> sortById() {
		
		ArrayList<Employee> empList = new ArrayList<Employee>();
		try {
			pstmt = con.prepareStatement("select * from employee_info order by id");
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				Employee employee = new Employee(rs.getInt("id"), rs.getString("name"), rs.getFloat("salary"));
				empList.add(employee);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return empList;
	}
	
	@Override
	public ArrayList<Employee> sortByName() {
		ArrayList<Employee> empList = new ArrayList<Employee>();
		try {
			pstmt = con.prepareStatement("select * from employee_info order by name");
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				Employee employee = new Employee(rs.getInt("id"), rs.getString("name"), rs.getFloat("salary"));
				empList.add(employee);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return empList;
	}
	
	@Override
	public ArrayList<Employee> listMaxSalaryEmployees() {
		ArrayList<Employee> empList = new ArrayList<Employee>();
		try {
			pstmt = con.prepareStatement("select * from employee_info where salary = (select max(salary) from employee_info) order by name");
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				Employee employee = new Employee(rs.getInt("id"), rs.getString("name"), rs.getFloat("salary"));
				empList.add(employee);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return empList;
	}
	
	@Override
	public ArrayList<Employee> listMinSalaryEmployees() {
		ArrayList<Employee> empList = new ArrayList<Employee>();
		try {
			pstmt = con.prepareStatement("select * from employee_info where salary = (select min(salary) from employee_info) order by name");
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				Employee employee = new Employee(rs.getInt("id"), rs.getString("name"), rs.getFloat("salary"));
				empList.add(employee);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return empList;
	}

}
