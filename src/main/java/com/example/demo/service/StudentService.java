package com.example.demo.service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepo studentRepo;
    public void saveStudent(Student student){
        studentRepo.save(student);
        System.out.println("Student record saved with Id::" +student.getId());
    }
    public List<Student> getAllStudents(){
        return studentRepo.findAll();
    }
}
