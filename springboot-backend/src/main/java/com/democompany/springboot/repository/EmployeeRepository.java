package com.democompany.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.democompany.springboot.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long>{

}
