package com.springrest.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.springrest.pojo.Employee;

public interface EmployeeDAO extends JpaRepository<Employee, Long>{
	
//	@Query("SELECT CASE WHEN COUNT(s)>0 THEN TRUE ELSE FALSE END FROM Employee s WHERE s.eid= ?1")
//	Boolean isEmpExistById(Long id);

}