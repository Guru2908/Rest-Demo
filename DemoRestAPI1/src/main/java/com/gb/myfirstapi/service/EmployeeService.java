package com.gb.myfirstapi.service;


import java.util.List;

import com.gb.myfirstapi.bean.Employee;


public interface EmployeeService {

	Employee save(Employee employee);
	
	public List<Employee> getAllEmployees();

	boolean findEmployee(String userName, String password);


}
