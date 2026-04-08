package com.studenthealth.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.studenthealth.model.HealthResource;
import com.studenthealth.repository.HealthRepository;

@Service
public class HealthService {

    private final HealthRepository repository;

    public HealthService(HealthRepository repository) {
        this.repository = repository;
    }

    // Add Health Resource
    public HealthResource addResource(HealthResource resource) {
        return repository.save(resource);
    }

    // Get All Resources
    public List<HealthResource> getAllResources() {
        return repository.findAll();
    }

    // Delete Resource
    public void deleteResource(Long id) {
        repository.deleteById(id);
    }

}