package com.studenthealth.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.studenthealth.model.Feedback;
import com.studenthealth.service.FeedbackService;

@RestController
@RequestMapping("/api/feedback")
@CrossOrigin(origins = "*")
public class FeedbackController {

    private final FeedbackService service;

    public FeedbackController(FeedbackService service) {
        this.service = service;
    }

    // Submit Feedback
    @PostMapping
    public Feedback submitFeedback(@RequestBody Feedback feedback) {
        return service.saveFeedback(feedback);
    }

    // Get All Feedback
    @GetMapping
    public List<Feedback> getAllFeedback() {
        return service.getAllFeedback();
    }

    // Delete Feedback
    @DeleteMapping("/{id}")
    public void deleteFeedback(@PathVariable Long id) {
        service.deleteFeedback(id);
    }
}