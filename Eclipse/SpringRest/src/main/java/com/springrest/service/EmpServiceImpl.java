package com.springrest.service;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.dao.EmployeeDAO;
import com.springrest.pojo.Employee;

@Service
public class EmpServiceImpl implements EmpService {

	@Autowired
	private EmployeeDAO employeedao;
    // ALL get requests--------------------------------------------------------------------
	@Override
	public List<Employee> getEmp() {
		// TODO Auto-generated method stub
		return employeedao.findAll();
	}
	
	@SuppressWarnings("deprecation")
	@Override
	public Employee getEmployee(Long eid) {
		// TODO Auto-generated method stub
		/*
		 * Employee e=null; for(Employee emp: l) { if(emp.getEid()==eid) { e=emp; } }
		 */
		return employeedao.findById(eid).get();
	}

	@Override
	public List<Employee> getEmployeeBySal(Double esal) {
		List<Employee> emp=employeedao.findAll();
		List<Employee> empbysal=emp.stream().filter(e->e.getEsal()<esal).collect(Collectors.toList());
		return empbysal;
	}
	
	 // ALL POST requests--------------------------------------------------------------------
	@Override
	public Employee addEmployee(Employee emp) {
		//l.add(emp);
		employeedao.save(emp);
		return emp;
	}
	
	@Override
	public List<Employee> addEmployees(List<Employee> ls) {
		//l.addAll(ls);
		employeedao.saveAll(ls);
		return ls;
	}
	
	 // ALL PUT requests--------------------------------------------------------------------
	@Override
	public Employee updateEmployee(Employee emp) {
		// TODO Auto-generated method stub
		employeedao.save(emp);
		return emp;
	}
	
	
	 // ALL DELETE requests--------------------------------------------------------------------
	@Override
	public String deleteEmployee(Long eid) {
		// TODO Auto-generated method stub
		//Employee e=employeedao.getById(eid);
		employeedao.deleteById(eid);
		return "Deleted employee with id "+eid;
	}

	
	
}
