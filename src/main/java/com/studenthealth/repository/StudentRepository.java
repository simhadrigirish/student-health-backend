package com.studenthealth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.studenthealth.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

    Student findByEmail(String email);

}