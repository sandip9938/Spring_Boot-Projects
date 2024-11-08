package com.sp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.sp.model.Employee;
import com.sp.service.IEmployeeService;

@Controller("empCont")
public class EmployeeOpreationController {

	@Autowired
	private IEmployeeService iEmployeeService;

	public List<Employee> showAllEmployeeDesg(String desg1, String desg2) throws Exception {

		List<Employee> list = iEmployeeService.fetchallEmployessByDesg(desg1, desg2);
		return list;

	}

	public String registerEmployee(Employee emp) throws Exception {
		String resultMesg = iEmployeeService.registerEmployee(emp);
		return resultMesg;
	}
}
