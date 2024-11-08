package com.sp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import com.sp.dao.IEmployeeDao;
import com.sp.model.Employee;

@Service("empService")
public class EmployeeService implements IEmployeeService {

	@Autowired
	@Qualifier("dbDao")
	private IEmployeeDao dao;

	@Override
	public List<Employee> fetchallEmployessByDesg(String desg1, String desg2) throws Exception {
		List<Employee> list = dao.getEmployeeDesg(desg1, desg2);
		return list;
	}

	@Override
	public String registerEmployee(Employee emp) throws Exception {
		int result = dao.insertEmployee(emp);
		return result == 0 ? "Employee Not Registered" : "Employee Registered";
	}

}
