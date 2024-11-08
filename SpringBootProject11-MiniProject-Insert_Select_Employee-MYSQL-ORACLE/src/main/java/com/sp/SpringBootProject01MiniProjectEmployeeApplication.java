package com.sp;

import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.sp.controller.EmployeeOpreationController;
import com.sp.model.Employee;

@SpringBootApplication
@ImportResource("com/sp/configs/applicationContext.xml")
public class SpringBootProject01MiniProjectEmployeeApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringBootProject01MiniProjectEmployeeApplication.class, args);
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Desg1: ");
		String desg1 = scanner.next();
		System.out.println("Enter Desg2: ");
		String desg2 = scanner.next();
		EmployeeOpreationController controll = ctx.getBean("empCont", EmployeeOpreationController.class);
		try {
			List<Employee> list = controll.showAllEmployeeDesg(desg1, desg2);
			list.forEach((employee) -> {
				System.out.println(employee);
			});
		} catch (Exception e) {
			e.printStackTrace();

		}
		System.out.println("Enter EmployeeNo: ");
		String no = scanner.next();
		System.out.println("Enter EmployeeName: ");
		String name = scanner.next();
		System.out.println("Enter EmployeeJob: ");
		String job = scanner.next();
		System.out.println("Enter EmployeeSalary: ");
		String salary = scanner.next();
		System.out.println("Enter EmployeeDeptNo: ");
		String dept = scanner.next();

		Employee employee = new Employee();
		employee.setEmpno(no);
		employee.setEmpName(name);
		employee.setEmpJob(job);
		employee.setSalary(salary);
		employee.setDept(dept);

		try {
			String resultMesg=controll.registerEmployee(employee);
			System.out.println(resultMesg);
		} catch (Exception e) {
			e.printStackTrace();
		}
		((ConfigurableApplicationContext) ctx).close();
	}

}
