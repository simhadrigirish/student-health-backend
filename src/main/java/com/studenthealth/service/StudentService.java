package com.studenthealth.service;

import org.springframework.stereotype.Service;

import com.studenthealth.model.Student;
import com.studenthealth.repository.StudentRepository;

@Service
public class StudentService {

    private final StudentRepository repository;

    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }

    // Register Student
    public Student register(Student student) {
        return repository.save(student);
    }

    // Login Student
    public Student login(String email, String password) {

        Student student = repository.findByEmail(email);

        if (student != null && student.getPassword().equals(password)) {
            return student;
        }

        return null;
    }

}