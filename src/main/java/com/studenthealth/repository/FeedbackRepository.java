package com.studenthealth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.studenthealth.model.Feedback;

public interface FeedbackRepository extends JpaRepository<Feedback, Long> {

}