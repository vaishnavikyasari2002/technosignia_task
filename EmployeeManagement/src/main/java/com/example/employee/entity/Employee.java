package com.example.employee.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
	
	@Id
	 Long id;
	
	 String name;
	
	 String address;
	
	 Long phonno;
	
	 String email;
	
	 String gender;
	
	 Long deathofBirth;
	
	 String department;
	
	 Long salary;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Long getPhonno() {
		return phonno;
	}

	public void setPhonno(Long phonno) {
		this.phonno = phonno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Long getDeathofBirth() {
		return deathofBirth;
	}

	public void setDeathofBirth(Long deathofBirth) {
		this.deathofBirth = deathofBirth;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Long getSalary() {
		return salary;
	}

	public void setSalary(Long salary) {
		this.salary = salary;
	}
	

	
}
