package com.internconnect.controller;
import com.internconnect.model.CvTemplate;
import com.internconnect.service.CvTemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Service
public class CvTemplateController {
    @Autowired
    private CvTemplateService cvTemplateService;

    @GetMapping("/cvTemplates")
    public List<CvTemplate> getCvTemplate(){
        return cvTemplateService.getCvTemplate();
    }

    @GetMapping("/cvTemplates/{id}")
    public CvTemplate getCvTemplate(@PathVariable Integer id){
        return cvTemplateService.getSingleCvTemplate(id);
    }

    @PostMapping("/cvTemplates")
    public CvTemplate saveCvTemplate (@RequestBody CvTemplate cvTemplate){
        return cvTemplateService.saveCvTemplate(cvTemplate);
    }

    @PutMapping("/cvTemplates/{id}")
    public CvTemplate updateCvTemplate(@PathVariable Integer id, @RequestParam CvTemplate cvTemplate){
        cvTemplate.setId(id);
        return cvTemplateService.updateCvTemplate(cvTemplate);
    }
    @DeleteMapping("/cvTemplates")
    public void deleteCvTemplate(@RequestParam Integer id){
        cvTemplateService.deleteCvTemplate(id);
    }

}
