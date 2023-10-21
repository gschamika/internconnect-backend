package com.internconnect.repository;
import com.internconnect.model.InterviewFeedback;
import java.util.List;
import java.util.Optional;

public interface InterviewFeedbackRepository {
    List<InterviewFeedback> findByName(String name);

    Optional<InterviewFeedback> findById(Integer id);
}
