package com.internconnect.repository;
import com.internconnect.model.Vacancy;

import java.util.List;
import java.util.Optional;

public interface VacancyRepository {
    List<Vacancy> findByName(String name);

    Optional<Vacancy> findById(Integer id);
}
