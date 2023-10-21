package com.internconnect.service;

import com.internconnect.model.Student;

import java.util.List;

public interface StudentService {
    List<Student> getStudents();

    Student saveStudent (Student student);

    Student getSingleStudent (Integer id);

    void deleteStudent (Integer id);

    Student updateStudent (Student student);

    List<Student> getStudentsByName(String studentName);
}
