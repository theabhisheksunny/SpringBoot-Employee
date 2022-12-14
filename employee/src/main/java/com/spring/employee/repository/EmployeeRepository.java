package com.spring.employee.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.employee.model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
