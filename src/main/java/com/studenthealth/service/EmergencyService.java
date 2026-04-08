package com.studenthealth.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.studenthealth.model.EmergencyContact;
import com.studenthealth.repository.EmergencyRepository;

@Service
public class EmergencyService {

    private final EmergencyRepository repository;

    public EmergencyService(EmergencyRepository repository) {
        this.repository = repository;
    }

    // Add Emergency Contact
    public EmergencyContact addContact(EmergencyContact contact) {
        return repository.save(contact);
    }

    // Get All Contacts
    public List<EmergencyContact> getAllContacts() {
        return repository.findAll();
    }

    // Delete Contact
    public void deleteContact(Long id) {
        repository.deleteById(id);
    }
}