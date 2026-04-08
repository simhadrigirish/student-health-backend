package com.studenthealth.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.studenthealth.model.HealthResource;
import com.studenthealth.service.HealthService;

@RestController
@RequestMapping("/api/health")
@CrossOrigin(origins = "*")
public class HealthController {

    private final HealthService service;

    public HealthController(HealthService service) {
        this.service = service;
    }

    // Add Health Resource
    @PostMapping
    public HealthResource addResource(@RequestBody HealthResource resource) {
        return service.addResource(resource);
    }

    // Get All Health Resources
    @GetMapping
    public List<HealthResource> getAllResources() {
        return service.getAllResources();
    }

    // Delete Resource
    @DeleteMapping("/{id}")
    public void deleteResource(@PathVariable Long id) {
        service.deleteResource(id);
    }
}