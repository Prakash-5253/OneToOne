package com.example.demoForOneToOne.controller;

import com.example.demoForOneToOne.entity.Student;
import com.example.demoForOneToOne.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class OneToOneController {
    @Autowired
    StudentRepository studentRepository;
    @PostMapping("/post")
    public Student addInfo(@RequestBody Student studDetails ){
        Student std=studentRepository.save(studDetails);
        return std;
    }
    @DeleteMapping("/deleteMapping/{studentId}")
    public String deleteDetails(@PathVariable("studentId") String studentId){
        studentRepository.deleteById(studentId);
        return "deleted Successfully";
    }
}
