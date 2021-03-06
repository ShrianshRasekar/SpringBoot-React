package com.springrest.service;

import java.util.List;

import com.springrest.pojo.*;

public interface EmpService {

	public List<Employee> getEmp();
	public Employee getEmployee(Long eid);
	public List<Employee> getEmployeeBySal(Double esal);

	public Employee addEmployee(Employee emp);
	

	public List<Employee> addEmployees(List<Employee> ls);

	public String deleteEmployee(Long eid);

	public Employee updateEmployee(Employee emp);
}
