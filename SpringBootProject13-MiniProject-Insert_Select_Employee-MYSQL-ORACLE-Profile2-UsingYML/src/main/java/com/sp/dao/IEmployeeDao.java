package com.sp.dao;

import java.util.List;

import com.sp.model.Employee;

public interface IEmployeeDao {
	public List<Employee> getEmployeeDesg(String desg1, String desg2) throws Exception;

	int insertEmployee(Employee emp) throws Exception;

}
