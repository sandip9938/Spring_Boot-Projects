package com.sp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import com.sp.model.Employee;

@Repository("empMYSQLDao")
@Profile("application3")
public class EmployeeDao2 implements IEmployeeDao {
	private static final String GET_EMP_DESG = " SELECT employeeId, employeename, employeejob, salary, deptno FROM Employee WHERE employeejob IN (?, ?) ORDER BY salary";
	private static final String INSERT_EMP = "Insert Into Employee(employeeId, employeename, employeejob, salary, deptno) Values(?,?,?,?,?) ";

	@Autowired
	private DataSource ds;

	@Override
	public List<Employee> getEmployeeDesg(String desg1, String desg2) throws Exception {
		List<Employee> list = new ArrayList<>();
		try (Connection con = ds.getConnection(); PreparedStatement ps = con.prepareStatement(GET_EMP_DESG)) {

			ps.setString(1, desg1);
			ps.setString(2, desg2);

			try (ResultSet rs = ps.executeQuery()) {
				while (rs.next()) {
					Employee employee = new Employee();
					employee.setEmpno(rs.getString(1));
					employee.setEmpName(rs.getString(2));
					employee.setEmpJob(rs.getString(3));
					employee.setSalary(rs.getString(4));
					employee.setDept(rs.getString(5));
					list.add(employee);
				}
			}
		} catch (SQLException e) {
			// Use a logging framework here
			e.printStackTrace(); // Replace with proper logging
			throw e; // Provide context in the exception
		} catch (Exception se) {
			se.printStackTrace();
			throw se;
		}
		return list;
	}

	@Override
	public int insertEmployee(Employee emp) throws Exception {
		int result = 0;
		try (Connection con = ds.getConnection(); PreparedStatement ps = con.prepareStatement(INSERT_EMP);) {

			ps.setString(1, emp.getEmpno());
			ps.setString(2, emp.getEmpName());
			ps.setString(3, emp.getEmpJob());
			ps.setString(4, emp.getDept());
			ps.setString(5, emp.getDept());

			result = ps.executeUpdate();

		} catch (SQLException e) {
			// Use a logging framework here
			e.printStackTrace(); // Replace with proper logging
			throw e; // Provide context in the exception
		} catch (Exception se) {
			se.printStackTrace();
			throw se;
		}

		return result;
	}
}
