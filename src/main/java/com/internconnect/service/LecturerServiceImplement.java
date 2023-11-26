package com.internconnect.service;
import com.internconnect.model.Lecturer;
import com.internconnect.repository.LecturerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
@Service
public class LecturerServiceImplement implements LecturerService{
    @Autowired
    private LecturerRepository lecturerRepository;


    @Override
    public List<Lecturer> getLecturers() {
        return null;
    }

    @Override
    public Lecturer saveLecturer(Lecturer lecturer) {
        return lecturerRepository.save(lecturer);
    }

    @Override
    public Lecturer getSingleLecturer(Integer id) {
        Optional<Lecturer> lecturer = lecturerRepository.findById(id);
        if (lecturer.isPresent()){
            return lecturer.get();
        }
        throw new RuntimeException("Lecturer is not found for the id" + id);
    }

    @Override
    public void deleteLecturer(Integer id) {
        lecturerRepository.deleteById(id);
    }

    @Override
    public Lecturer updateLecturer(Lecturer lecturer) {
        return lecturerRepository.save(lecturer);
    }

    @Override
    public List<Lecturer> getLecturerByName(String name) {
        return null;
    }
}
