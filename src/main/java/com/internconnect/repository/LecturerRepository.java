package com.internconnect.repository;
import com.internconnect.model.Lecturer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface LecturerRepository extends JpaRepository<Lecturer, Integer> {
    List<Lecturer> findByName(String name);

    Optional<Lecturer> findById(Integer id);

}

