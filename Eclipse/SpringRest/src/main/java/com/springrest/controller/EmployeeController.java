package com.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.pojo.Employee;
import com.springrest.service.EmpService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/emp")
public class EmployeeController {
	@Autowired
	private EmpService empservice;

	// ALL GET requests--------------------------------------------------------*****------------
	@GetMapping("/test")
	public String testEmployees(){
		return "running";
		
	}
	@GetMapping("/emps")
	public List<Employee> getEmployees(){
		return empservice.getEmp();
		
	}
	
	@GetMapping("/empid/{eid}")
	public Employee getemployee(@PathVariable Long eid){
		return empservice.getEmployee(eid);
	}
	
	@GetMapping("/empsal/{esal}")
	public List<Employee> getEmployeeBySal(@PathVariable Double esal){
		return empservice.getEmployeeBySal(esal);
	}
	
	// ALL POST requests---------------------------------------------------------*****-----------
	@PostMapping("/addemp")
	public Employee addemployee(@RequestBody Employee emp){
		return empservice.addEmployee(emp);
	}
	
	@PostMapping("/addemps")
	public List<Employee> addemployees(@RequestBody List<Employee> ls){
		return empservice.addEmployees(ls);
	}
	
	// ALL PUT requests----------------------------------------------------------*****----------
	@PutMapping("/updateemp")
	public Employee updateemployee(@RequestBody Employee emp){
		return empservice.updateEmployee(emp);
	}
	
	
	// ALL Delete requests-------------------------------------------------------*****-------------
	@DeleteMapping("/employee/{eid}")
	public String deleteemployee(@PathVariable Long eid){
		return empservice.deleteEmployee(eid);
}
}