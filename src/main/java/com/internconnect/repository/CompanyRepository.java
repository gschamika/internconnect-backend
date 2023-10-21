package com.internconnect.repository;
import com.internconnect.model.Company;
import com.internconnect.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface CompanyRepository extends JpaRepository<Company, Integer> {
    List<Company> findByName(String name);

    Optional<Company> findById(Integer id);

}
