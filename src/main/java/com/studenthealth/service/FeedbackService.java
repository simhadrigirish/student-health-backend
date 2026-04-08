package com.studenthealth.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.studenthealth.model.Feedback;
import com.studenthealth.repository.FeedbackRepository;

@Service
public class FeedbackService {

    private final FeedbackRepository repository;

    public FeedbackService(FeedbackRepository repository) {
        this.repository = repository;
    }

    // Save Feedback
    public Feedback saveFeedback(Feedback feedback) {
        return repository.save(feedback);
    }

    // Get All Feedback
    public List<Feedback> getAllFeedback() {
        return repository.findAll();
    }

    // Delete Feedback
    public void deleteFeedback(Long id) {
        repository.deleteById(id);
    }
}