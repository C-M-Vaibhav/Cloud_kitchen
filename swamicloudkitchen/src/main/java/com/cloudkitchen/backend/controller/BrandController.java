package com.cloudkitchen.backend.controller;

import com.cloudkitchen.backend.model.BrandInfo;
import com.cloudkitchen.backend.repository.BrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/brand")
@CrossOrigin(origins = "http://localhost:5173")
public class BrandController {

    @Autowired
    private BrandRepository brandRepository;

    @GetMapping
    public BrandInfo getBrandDetails() {
        return brandRepository.findById(1L).orElse(null);
    }

    @GetMapping("/brand")
    public Map<String, String> getBrand() {
        Map<String, String> brand = new HashMap<>();
        brand.put("name", "Swami Cloud Kitchen");
        brand.put("tagline", "Fresh • Homely • Hygienic • Delicious");
        return brand;
    }
}