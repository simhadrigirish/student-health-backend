package com.studenthealth.controller;

import org.springframework.web.bind.annotation.*;

import com.studenthealth.model.Student;
import com.studenthealth.service.StudentService;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin(origins = "*")
public class AuthController {

    private final StudentService service;

    public AuthController(StudentService service) {
        this.service = service;
    }

    // Register Student
    @PostMapping("/register")
    public Student register(@RequestBody Student student) {
        return service.register(student);
    }

    // Login Student
    @PostMapping("/login")
    public Student login(@RequestBody Student student) {
        return service.login(student.getEmail(), student.getPassword());
    }
}