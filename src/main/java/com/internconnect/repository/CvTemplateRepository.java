package com.internconnect.repository;
import com.internconnect.model.CvTemplate;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CvTemplateRepository extends JpaRepository<CvTemplate, Integer> {
    List<CvTemplate> findByName(String name);

    Optional<CvTemplate> findById(Integer id);
}
