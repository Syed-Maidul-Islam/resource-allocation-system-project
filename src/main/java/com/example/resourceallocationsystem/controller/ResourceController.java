package com.example.resourceallocationsystem.controller;

import com.example.resourceallocationsystem.entity.Resource;
import com.example.resourceallocationsystem.service.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/resources") // Set the base path for all endpoints in this controller
@CrossOrigin(origins = "http://localhost:3000") // Allow requests from React app

public class ResourceController {

    @Autowired
    private ResourceService resourceService;

    // Fetch all resources
    @GetMapping
    public List<Resource> getAllResources() {
        return resourceService.getAllResources();
    }
}