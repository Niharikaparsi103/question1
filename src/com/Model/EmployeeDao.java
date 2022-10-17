package com.Model;

import java.util.List;

public interface EmployeeDao {

	public List<Employee> displayEmployee();
	public void addEmployee(Employee employee);
	public void updateEmployee(int id);
	public void deleteEmployee();
	void addEmployee();
	void updateEmployee();
}
