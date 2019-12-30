package com.gb.myfirstapi.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.gb.myfirstapi.bean.Employee;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer> {

	Object findByUserNameAndPassword(String userName, String password);

	@Query("select count(*) from Employee where userName=:userName and password=:password")
	int getEmployee(@Param(value = "userName") String userName,@Param(value = "password") String password);

}
