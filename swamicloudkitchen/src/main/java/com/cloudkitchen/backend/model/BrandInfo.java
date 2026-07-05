package com.cloudkitchen.backend.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "brand_info")
@Data
public class BrandInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String kitchen_name;
    private String about_text;
    private String location_address;
    private String phone_number;
}