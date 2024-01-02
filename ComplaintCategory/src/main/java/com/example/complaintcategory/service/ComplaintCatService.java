package com.example.complaintcategory.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.complaintcategory.entity.ComplaintCat;
import com.example.complaintcategory.repository.ComplaintCatRepository;

@Service
public class ComplaintCatService {
	@Autowired
	ComplaintCatRepository repository;
	
	public ComplaintCat createComplaintCat(ComplaintCat complaintCat) {
		return repository.save(complaintCat);
	}

	public ComplaintCat getComplaintCat(Long catid) {
		return repository.findById(catid).get();
	}

	public String deleteComplaintCatById(Long catid) {
		repository.deleteById(catid);
		return "Deletion Successfuly";
	}

	public List<ComplaintCat> fetchAllCmplaintCat(){ 
		return repository.findAll();
	}

	public ComplaintCat updateComplaintCat(ComplaintCat correctcomplaintCat, Long catid) {
		ComplaintCat complaintCat = repository.findById(catid).get();
		if (complaintCat.getStatus() != null) {
			complaintCat.setStatus(correctcomplaintCat.getStatus());
		}
		return repository.save(complaintCat);
	}
	
	 
	 
	 
}
