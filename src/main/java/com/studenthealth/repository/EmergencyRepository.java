package com.studenthealth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.studenthealth.model.EmergencyContact;

public interface EmergencyRepository extends JpaRepository<EmergencyContact, Long> {

}