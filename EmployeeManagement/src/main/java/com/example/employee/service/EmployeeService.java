package com.example.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.employee.entity.Employee;
import com.example.employee.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	EmployeeRepository repository;

	public Employee createEmployee(Employee employee) {
		return repository.save(employee);
	}

	public Employee getEmployeeById(int id) {
		return repository.findById(id).get();
	}

	public List<Employee> getAllEmployees() {
		return repository.findAll();
	}

	public String deleteEmployee(int id) {
		repository.deleteById(id);
		return "Deletion Successfuly";
	}

	public Employee updateEmployee(Employee correctEmployee, int id) {
		Employee employee = repository.findById(id).get();
		if (employee.getAddress() != null) {
			employee.setAddress(correctEmployee.getAddress());
		}
		if (employee.getSalary() != null) {
			employee.setSalary(correctEmployee.getSalary());
		}
		return repository.save(employee);
	}

}
