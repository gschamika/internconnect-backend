package com.internconnect.repository;
import com.internconnect.model.CompanyStaff;
import java.util.List;
import java.util.Optional;

public interface CompanyStaffRepository {
    List<CompanyStaff> findByCompanyStaffName(String companyStaffName);

    Optional<CompanyStaff> findById(Integer id);
}
