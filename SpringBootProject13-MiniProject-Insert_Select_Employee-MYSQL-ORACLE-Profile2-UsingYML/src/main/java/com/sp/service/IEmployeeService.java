package com.sp.service;

import java.util.List;

import com.sp.model.Employee;

public interface IEmployeeService {
	public List<Employee> fetchallEmployessByDesg(String desg1, String desg2) throws Exception;

	public String registerEmployee(Employee emp) throws Exception;
}
