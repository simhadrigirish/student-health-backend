package com.studenthealth.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.studenthealth.model.EmergencyContact;
import com.studenthealth.service.EmergencyService;

@RestController
@RequestMapping("/api/emergency")
@CrossOrigin(origins = "*")
public class EmergencyController {

    private final EmergencyService service;

    public EmergencyController(EmergencyService service) {
        this.service = service;
    }

    // Add Emergency Contact
    @PostMapping
    public EmergencyContact addContact(@RequestBody EmergencyContact contact) {
        return service.addContact(contact);
    }

    // Get All Contacts
    @GetMapping
    public List<EmergencyContact> getAllContacts() {
        return service.getAllContacts();
    }

    // Delete Contact
    @DeleteMapping("/{id}")
    public void deleteContact(@PathVariable Long id) {
        service.deleteContact(id);
    }
}