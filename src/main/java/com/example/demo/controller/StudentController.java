package com.example.demo.controller;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {
    @Autowired
    private StudentService service;

//CRUD operations--->CREATE,READ,UPDATE,DELETE
//CREATE OPERATION
    @PostMapping("/student")
    public String createStudent(@RequestBody Student student){
        service.saveStudent(student);
        return "Student record saved with StudentId::" +student.getId();
    }

   //READ OPERATION
    @GetMapping("/students")
    public List<Student> getAllStudents(Student student) {
        return service.getAllStudents();
    }
}
