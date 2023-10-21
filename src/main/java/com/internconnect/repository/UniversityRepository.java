package com.internconnect.repository;
import com.internconnect.model.University;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface UniversityRepository extends JpaRepository<University, Integer> {
    List<University> findByName(String name);

    Optional<University> findById(Integer id);

}
