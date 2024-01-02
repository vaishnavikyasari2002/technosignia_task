package com.example.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.employee.entity.Employee;
import com.example.employee.service.EmployeeService;

@RestController
@RequestMapping("/Employee")
public class EmployeeController {
	
	@Autowired
	EmployeeService service;

	@PostMapping("/save")
	private Employee saveEmployee(@RequestBody Employee employee) {
		return service.createEmployee(employee);
	}

	@GetMapping("find/{id}")
	private Employee saveEmployee(@PathVariable int id) {
		return service.getEmployeeById(id);
	}

	@GetMapping("/findAll")
	private List<Employee> getAllEmployees() {
		return service.getAllEmployees();
	}

	@DeleteMapping("delete/{id}")
	private String deleteEmployee(@PathVariable int id) {
		return service.deleteEmployee(id);
	}

	@PutMapping("update/{id}")
	private Employee updateEmployee(@RequestBody Employee employee, @PathVariable int id) {
		return service.updateEmployee(employee, id);

	}
}
