package com.cloudkitchen.backend.controller;

import com.cloudkitchen.backend.model.MenuItem;
import com.cloudkitchen.backend.repository.MenuItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/menu")
@CrossOrigin(origins = "http://localhost:5173") // Allows your React app to talk to this API
public class MenuController {

    @Autowired
    private MenuItemRepository menuItemRepository;

    @GetMapping
    public List<MenuItem> getAllMenuItems() {
        List<MenuItem> menuItems = menuItemRepository.findAll();
        System.out.println("Fetched " + menuItems.size() + " menu items from the database");
        System.out.println("Fetched " + menuItems + " menu items from the database");
        return menuItems;
    }

    @PostMapping
    public MenuItem createMenuItem(@RequestBody MenuItem menuItem) {
        return menuItemRepository.save(menuItem);
    }
}