package com.devFabricio.bds01.repositoryes;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devFabricio.bds01.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
