package com.example.complaintcategory.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.complaintcategory.entity.ComplaintCat;

public interface ComplaintCatRepository extends JpaRepository<ComplaintCat, Long> {

}
