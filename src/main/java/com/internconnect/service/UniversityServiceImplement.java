package com.internconnect.service;
import com.internconnect.model.University;
import com.internconnect.repository.UniversityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class UniversityServiceImplement implements UniversityService{
    @Autowired
    private UniversityRepository universityRepository;

    @Override
    public List<University> getUniversity(){
        return universityRepository.findAll();
    }

    @Override
    public University saveUniversity(University university) {
        return universityRepository.save(university);
    }

    @Override
    public University getSingleUniversity(Integer id) {
        Optional <University> university = universityRepository.findById(id);
        if (university.isPresent()){
            return university.get();
        }
        throw new RuntimeException("University is not found for the id" + id);
    }
    @Override
    public void deleteUniversity(Integer id){
        universityRepository.deleteById(id);
    }

    @Override
    public University updateUniversity(University university) {
        return universityRepository.save(university);
    }

    @Override
    public List<University> getUniversityByName(String name) {
        return universityRepository.findByName(name);
    }
}
