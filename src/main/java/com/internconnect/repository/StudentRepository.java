package com.internconnect.repository;
import com.internconnect.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
    List<Student> findByStudentName(String studentName);

    Optional<Student> findById(Integer id);

}
