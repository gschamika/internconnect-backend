package com.internconnect.service;
import com.internconnect.model.Company;
import com.internconnect.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
@Service
public class CompanyServiceImplement implements CompanyService{
    @Autowired
    private CompanyRepository companyRepository;

    @Override
    public List<Company> getCompany(){
        return companyRepository.findAll();
    }

    @Override
    public Company saveCompany(Company company) {
        return companyRepository.save(company);
    }

    @Override
    public Company getSingleCompany(Integer id) {
        Optional<Company> company = companyRepository.findById(id);
        if (company.isPresent()){
            return company.get();
        }
        throw new RuntimeException("Company is not found for the id" + id);
    }

    @Override
    public void deleteCompany(Integer id) {
        companyRepository.deleteById(id);
    }

    @Override
    public Company updateCompany(Company company) {
        return companyRepository.save(company);
    }

    @Override
    public List<Company> getCompanyByName(String name) {
        return companyRepository.findByName(name);
    }
}
