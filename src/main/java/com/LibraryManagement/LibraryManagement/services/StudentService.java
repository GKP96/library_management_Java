package com.LibraryManagement.LibraryManagement.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.LibraryManagement.LibraryManagement.models.Student;
import com.LibraryManagement.LibraryManagement.repos.StudentRepository;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public void createStudent(Student student){
        studentRepository.save(student);
    }

    public Student getStudentById(int id){
        return studentRepository.findById(id).orElse(null);

    }

    public List<Student> getStudents(){
        return studentRepository.findAll();
    }
}
