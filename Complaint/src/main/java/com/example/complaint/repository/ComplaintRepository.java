package com.example.complaint.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.complaint.entity.Complaint;

public interface ComplaintRepository extends JpaRepository<Complaint, Long> {

}
