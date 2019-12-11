package com.Abhinash.springbootmysqlrestapi.service;

import com.Abhinash.springbootmysqlrestapi.entity.Student;
import com.Abhinash.springbootmysqlrestapi.exception.ResourceNotFoundException;
import com.Abhinash.springbootmysqlrestapi.repository.StudentRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {


    @Autowired
    StudentRepos studentRepos;

    //Method to save student data into database
    public Student saveStudent(Student student) {
        return studentRepos.save(student);
    }


    //to get all the student details from database
    public List<Student> getAllStudent() {
       return studentRepos.findAll();
    }

    public Student updateStudentDetails(Long id, Student student){
       Student studentDet = studentRepos.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Student not foind with ", "id", id));
       return studentRepos.save(student);
    }








}




