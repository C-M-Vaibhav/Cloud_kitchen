package com.cloudkitchen.backend.repository;

import com.cloudkitchen.backend.model.MenuItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuItemRepository extends JpaRepository<MenuItem, Long> {
    // JpaRepository provides .findAll(), .save(), .findById() automatically!
}