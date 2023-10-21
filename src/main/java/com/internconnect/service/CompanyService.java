package com.internconnect.service;
import com.internconnect.model.Company;

import java.util.List;

public interface CompanyService {
    List<Company> getCompany();

    Company saveCompany (Company company);

    Company getSingleCompany (Integer id);

    void deleteCompany (Integer id);

    Company updateCompany (Company university);

    List<Company> getCompanyByName(String name);
}
