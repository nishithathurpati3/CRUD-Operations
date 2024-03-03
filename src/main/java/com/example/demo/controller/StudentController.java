package com.example.demo.controller;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    //GET RECORDS BY ID
    @GetMapping("/studentById/{id}")
    public Optional<Student> getStudentById(@PathVariable int id){
        return service.getStudentById(id);
    }
    @GetMapping("/students/{age}")
    public Student getStudentByAge(@RequestParam(name="age") int age){
        return service.getStudentByAge(age);
    }
    @GetMapping("/students/{studentName}")
    public Student getStudentByName(@RequestParam(name="studentName") String name){
        return service.getStudentByName(name);
    }
    @PutMapping("/editStudents/{id}")
    public Student updateStudent(@PathVariable int id,@RequestBody Student studentTobeUpdated){
        return service.updateStudentByID(id, studentTobeUpdated);
    }
    @DeleteMapping("/students")
    public String deleteAllStudents(){
        return service.deleteAllStudents();
    }
}
