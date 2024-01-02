package com.example.complaint.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.complaint.entity.Complaint;
import com.example.complaint.repository.ComplaintRepository;
@Service
public class ComplaintService {

	@Autowired
	ComplaintRepository repository;
	public Complaint createComplaint(Complaint complaint) {
		return repository.save(complaint);
	}
	public Optional<Complaint> getMapping(Long id) {
		return repository.findById(id);
	}
	public String deleteComplaintById(Long id) {
		 repository.deleteById(id);
		return "Deleted Successfully";
	}
	public List<Complaint> fetchAllComplaint() {
		return repository.findAll();
	}
	public Complaint updateComplaint(Complaint correctcomplaint,Long id) {
		Complaint complaint=repository.findById(id).get();
		if (complaint.getStatus() != null) {
			complaint.setStatus(correctcomplaint.getStatus());
		}
		if (complaint.getDescription() != null) {
			complaint.setDescription(correctcomplaint.getDescription());
		}
		
		return repository.save(complaint);
	}

}
