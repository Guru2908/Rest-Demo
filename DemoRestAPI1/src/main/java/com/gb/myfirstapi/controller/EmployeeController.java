package com.gb.myfirstapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gb.myfirstapi.bean.Employee;
import com.gb.myfirstapi.service.EmployeeService;

@RestController
@RequestMapping(value = "/login")
public class EmployeeController {

	@Autowired(required = true)
	private EmployeeService service;

	@PostMapping(value = "/saveUser")
	public Employee saveEmployee(@RequestBody Employee employee) {
		return service.save(employee);

	}

	@GetMapping(value = "/employees")
	public List<Employee> name() {
		return service.getAllEmployees();

	}

	@PostMapping(value = "/validate")
	public boolean loginValidation(@RequestBody Employee employee) {
		String userName = employee.getUserName();
		String password = employee.getPassword();
		return service.findEmployee(userName, password);
	}
}
