package com.devFabricio.bds01.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devFabricio.bds01.dto.EmployeeDTO;
import com.devFabricio.bds01.entities.Department;
import com.devFabricio.bds01.entities.Employee;
import com.devFabricio.bds01.repositoryes.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository repository;
	
	@Transactional(readOnly = true)
	public Page<EmployeeDTO> findAll(Pageable pageable){
		Page<Employee> page = repository.findAll(pageable);
		return page.map(x -> new EmployeeDTO(x));
		
	}

	public EmployeeDTO insert(EmployeeDTO dto) {
		Employee entity = new Employee();
		entity.setName(dto.getName());
		entity.setEmail(dto.getEmail());
		entity.setDepartment(new Department(dto.getDepartmentId(),null));
		entity = repository.save(entity);
		return new EmployeeDTO(entity);
	}
	
}
