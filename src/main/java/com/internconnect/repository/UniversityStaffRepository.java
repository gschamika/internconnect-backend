package com.internconnect.repository;
import com.internconnect.model.UniversityStaff;

import java.util.List;
import java.util.Optional;

public interface UniversityStaffRepository {
    List<UniversityStaff> findByName(String name);

    Optional<UniversityStaff> findById(Integer id);
}
