package com.gb.myfirstapi.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EmployeeDetails")
public class Employee {

	@Id
	@GeneratedValue
	private int emplpoyeeId;
	private String employeeName;
	private String userName;
	private String password;
	private String company;

	public int getEmplpoyeeId() {
		return emplpoyeeId;
	}

	public void setEmplpoyeeId(int emplpoyeeId) {
		this.emplpoyeeId = emplpoyeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

}
