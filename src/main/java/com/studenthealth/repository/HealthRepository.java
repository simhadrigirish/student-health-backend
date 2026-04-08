package com.studenthealth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.studenthealth.model.HealthResource;

public interface HealthRepository extends JpaRepository<HealthResource, Long> {

}