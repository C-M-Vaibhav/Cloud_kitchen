package com.cloudkitchen.backend.repository;

import com.cloudkitchen.backend.model.BrandInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrandRepository extends JpaRepository<BrandInfo, Long> {
    // JpaRepository provides .findAll(), .save(), .findById() automatically!
}