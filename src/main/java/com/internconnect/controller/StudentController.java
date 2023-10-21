package com.internconnect.controller;
import com.internconnect.model.Student;
import com.internconnect.model.User;
import com.internconnect.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/students")
    public List<Student> getStudents(){
        return studentService.getStudents();
    }

    @GetMapping("/students/{student_id}")
    public Student getStudent(@PathVariable Integer id){
        return studentService.getSingleStudent(id);
    }

    @PostMapping("/students")
    public Student saveStudent (@RequestBody Student student){
        return studentService.saveStudent(student);
    }

    @PutMapping("/students/{id}")
    public Student updateStudent(@PathVariable Integer id, @RequestParam Student student){
        student.setId(id);
        return studentService.updateStudent(student);
    }
    @DeleteMapping("/students")
    public void deleteStudent(@RequestParam Integer id){
        studentService.deleteStudent(id);
    }
    @GetMapping("/students/filterByName")
    public ResponseEntity<List<Student>> getStudentsByName(@RequestParam String student_name){
        return new ResponseEntity<List<Student>>(studentService.getStudentsByName(student_name), HttpStatus.OK);
    }
}
