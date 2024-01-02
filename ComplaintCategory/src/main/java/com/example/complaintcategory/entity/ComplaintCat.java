package com.example.complaintcategory.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class ComplaintCat {
	@Id
	 Long catid;
	
	Long empid;
	
	 String catname;
	
	 String status;

	public Long getCatid() {
		return catid;
	}

	public void setCatid(Long catid) {
		this.catid = catid;
	}

	public Long getEmpid() {
		return empid;
	}

	public void setEmpid(Long empid) {
		this.empid = empid;
	}

	public String getCatname() {
		return catname;
	}

	public void setCatname(String name) {
		this.catname = catname;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	 
}
