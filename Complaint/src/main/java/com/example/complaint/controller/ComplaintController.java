package com.example.complaint.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.complaint.entity.Complaint;
import com.example.complaint.service.ComplaintService;



@RestController
public class ComplaintController {
	@Autowired
	ComplaintService service;
	
	@PostMapping("/complaint")
	public Complaint createComplaint(@RequestBody Complaint complaint) {
		return service.createComplaint(complaint);
		
	}
	@GetMapping("complaint/{id}")
	public Optional<Complaint> getMapping(@PathVariable Long id) {
		return service.getMapping(id);
		
	}
	@DeleteMapping("/complaint")
	public String deleteMapping(@RequestBody Long id) {
		return service.deleteComplaintById(id);
		
	}
	@GetMapping("/complaint")
	public List<Complaint> fetchAllComplaint(){
		return service.fetchAllComplaint();
	}
	@PutMapping("/complaint")
	public Complaint updatecomplaint(@RequestBody Complaint complaint,@PathVariable Long id) {
		return service.updateComplaint(complaint,id);
	}
	
}
