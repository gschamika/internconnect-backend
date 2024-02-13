package com.internconnect.controller;
import com.internconnect.model.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.internconnect.service.CompanyService;
import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1")
public class CompanyController {
    @Autowired
    private CompanyService companyService;

    @GetMapping("/company")
    public List<Company> getCompany(){
        return companyService.getCompany();
    }

    @PostMapping("/company")
    public Company saveCompany (@RequestBody Company company){
        return companyService.saveCompany(company);
    }

    @PutMapping("/company/{id}")
    public Company updateCompany(@PathVariable Integer id, @RequestParam Company company){
        company.setId(id);
        return companyService.updateCompany(company);
    }
    @DeleteMapping("/company")
    public void deleteCompany(@RequestParam Integer id){
        companyService.deleteCompany(id);
    }
}

