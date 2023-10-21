package com.internconnect.service;
import com.internconnect.model.CvTemplate;
import com.internconnect.repository.CvTemplateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class CvTemplateServiceImplement implements CvTemplateService{
    @Autowired
    private CvTemplateRepository cvTemplateRepository;

    @Override
    public List<CvTemplate> getCvTemplate(){
        return cvTemplateRepository.findAll();
    }

    @Override
    public CvTemplate saveCvTemplate(CvTemplate cvTemplate) {
        return cvTemplateRepository.save(cvTemplate);
    }

    @Override
    public CvTemplate getSingleCvTemplate(Integer id) {
        Optional<CvTemplate> cvTemplate = cvTemplateRepository.findById(id);
        if (cvTemplate.isPresent()){
            return cvTemplate.get();
        }
        throw new RuntimeException("University is not found for the id" + id);
    }
    @Override
    public void deleteCvTemplate(Integer id){
        cvTemplateRepository.deleteById(id);
    }

    @Override
    public CvTemplate updateCvTemplate(CvTemplate cvTemplate) {
        return cvTemplateRepository.save(cvTemplate);
    }
}
