package com.internconnect.controller;
import com.internconnect.model.Lecturer;
import com.internconnect.model.Student;
import com.internconnect.service.LecturerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1")
public class LecturerController {
    @Autowired
    private LecturerService lecturerService;

    @GetMapping("/lecturer")
    public List<Lecturer> getLecturers(){
        return lecturerService.getLecturers();
    }

    @GetMapping("/lecturer/{lec_id}")
    public Lecturer getLecturer(@PathVariable Integer id){
        return lecturerService.getSingleLecturer(id);
    }

    @PostMapping("/lecturer")
    public Lecturer saveLecturer (@RequestBody Lecturer lecturer){
        return lecturerService.saveLecturer(lecturer);
    }

    @PutMapping("/lecturer/{id}")
    public Lecturer updateLecturer(@PathVariable Integer id, @RequestParam Lecturer lecturer){
        lecturer.setId(id);
        return lecturerService.updateLecturer(lecturer);
    }
    @DeleteMapping("/lecturer")
    public void deleteStudent(@RequestParam Integer id){
        lecturerService.deleteLecturer(id);
    }
}

