package com.devFabricio.bds01.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.devFabricio.bds01.dto.DepartmentDTO;
import com.devFabricio.bds01.entities.Department;
import com.devFabricio.bds01.repositoryes.DepartmentRepository;

@Service
public class DepartmentService {
	
	@Autowired
	private DepartmentRepository repository;
	
	public List<DepartmentDTO> findAll(){
		List<Department> list = repository.findAll(Sort.by("name"));
		return list.stream().map(x -> new DepartmentDTO(x)).collect(Collectors.toList());
		
	}

}
