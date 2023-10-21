package com.internconnect.service;
import com.internconnect.model.University;

import java.util.List;

public interface UniversityService{
    List<University> getUniversity();

    University saveUniversity (University university);

    University getSingleUniversity (Integer id);

    void deleteUniversity (Integer id);

    University updateUniversity (University university);

    List<University> getUniversityByName(String name);
}
