package com.example.complaintcategory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.complaintcategory.entity.ComplaintCat;
import com.example.complaintcategory.service.ComplaintCatService;

@RestController
public class ComplaintCatController {
	@Autowired
	ComplaintCatService service;
	
	@PostMapping("/complaintCat")
	public ComplaintCat createComplaintCat(@RequestBody ComplaintCat complaintCat) {
		return service. createComplaintCat(complaintCat);
		
	}
	@GetMapping("complaintCat/{catid}")
	public ComplaintCat getComplaintCat(@PathVariable Long catid) {
	return service.getComplaintCat(catid);
	}
	@DeleteMapping("/complaintCat")
	public String deleteComplaintCat(@RequestBody Long catid ) {
		return service. deleteComplaintCatById(catid);
		
	}
	@GetMapping("/complaintCat")
	public List<ComplaintCat> fetchAllComplaintCat(){
		return service.fetchAllCmplaintCat();
		
	}
	@PutMapping("/ComplaintCat")
	public ComplaintCat updateComplaintCat(@RequestBody ComplaintCat complaintCat, Long catid) {
		return service.updateComplaintCat(complaintCat,catid);
		
	}
}
