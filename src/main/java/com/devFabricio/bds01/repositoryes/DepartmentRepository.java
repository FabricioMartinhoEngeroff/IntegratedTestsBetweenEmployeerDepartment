package com.devFabricio.bds01.repositoryes;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devFabricio.bds01.entities.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long>{

}
