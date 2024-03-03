package com.example.demo.service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
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

    public Optional<Student> getStudentById(int id){
        return studentRepo.findById(id);
    }
    public Student getStudentByAge(int age){
        return studentRepo.findByAge(age);
    }
    public Student getStudentByName(String name){
        return studentRepo.findByName(name);
    }

    public Student updateStudentByID(int id, Student studentTobeUpdated) {
        if(studentRepo.existsById(id)){
            studentTobeUpdated.setId(id);
            return studentRepo.save(studentTobeUpdated);
        }
        else return null;
    }
    public String deleteAllStudents(){
        studentRepo.deleteAll();
        return "Student records delete !!";
    }
}
