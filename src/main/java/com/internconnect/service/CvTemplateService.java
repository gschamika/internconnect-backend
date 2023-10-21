package com.internconnect.service;

import com.internconnect.model.CvTemplate;
import java.util.List;

public interface CvTemplateService {
    List<CvTemplate> getCvTemplate();

    CvTemplate saveCvTemplate (CvTemplate cvTemplate);

    CvTemplate getSingleCvTemplate (Integer id);

    void deleteCvTemplate (Integer id);

    CvTemplate updateCvTemplate (CvTemplate cvTemplate);

}
