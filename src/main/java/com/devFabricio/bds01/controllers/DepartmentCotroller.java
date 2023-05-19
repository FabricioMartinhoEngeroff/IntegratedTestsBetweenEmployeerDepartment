package com.devFabricio.bds01.controllers;

import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devFabricio.bds01.dto.DepartmentDTO;
import com.devFabricio.bds01.services.DepartmentService;

@RestController
@RequestMapping(value = "/departments")
public class DepartmentCotroller {

	@Autowired
	private DepartmentService service;
	
	@GetMapping
	public ResponseEntity<List<DepartmentDTO>> findAll(){
		List<DepartmentDTO> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
}
