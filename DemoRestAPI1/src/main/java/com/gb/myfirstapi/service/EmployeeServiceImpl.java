package com.gb.myfirstapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gb.myfirstapi.bean.Employee;
import com.gb.myfirstapi.dao.EmployeeDao;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao dao;

	@Override
	public Employee save(Employee employee) {
		return dao.save(employee);
	}

	public List<Employee> getAllEmployees() {
		return dao.findAll();
	}

	@Override
	public boolean findEmployee(String userName, String password) {
		/*
		 * Employee employee = (Employee) dao.findByUserNameAndPassword(userName,
		 * password); if (employee.getUserName().equals(userName) &&
		 * employee.getPassword().equals(password)) return true; return false;
		 */

		int res = dao.getEmployee(userName, password);
		if (res == 0)
			return false;
		return true;

	}

}
