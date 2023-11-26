package com.internconnect.service;
import com.internconnect.model.Company;
import com.internconnect.model.Lecturer;

import java.util.List;

public interface LecturerService {
    List<Lecturer> getLecturers();

    Lecturer saveLecturer (Lecturer lecturer);

    Lecturer getSingleLecturer (Integer id);

    void deleteLecturer (Integer id);

    Lecturer updateLecturer (Lecturer lecturer);

    List<Lecturer> getLecturerByName(String name);
}
