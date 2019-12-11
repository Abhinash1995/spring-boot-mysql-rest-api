package com.Abhinash.springbootmysqlrestapi.controller;

import com.Abhinash.springbootmysqlrestapi.entity.Student;
import com.Abhinash.springbootmysqlrestapi.exception.ResourceNotFoundException;
import com.Abhinash.springbootmysqlrestapi.repository.StudentRepos;
import com.Abhinash.springbootmysqlrestapi.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("api")
public class StudentController {


    @Autowired
    StudentService studentService;

    @Autowired
    StudentRepos studentRepos;

    @GetMapping("/students")
    public List<Student> getAllStudent() {
        return studentService.getAllStudent();
    }

    @PostMapping("/student")
    public Student saveStudent(@Valid @RequestBody Student student) {
        return studentService.saveStudent(student);
    }

    @GetMapping("/student/{id}")
    public Student getStudentById(@PathVariable(value = "id") Long studentId) {
        return studentRepos.findById(studentId)
                .orElseThrow(() -> new ResourceNotFoundException("Student", "id", studentId));
    }

    @PutMapping("/student/{id}")
    public Student updateStudent(@PathVariable(value = "id") Long studentId,
                           @Valid @RequestBody Student student) {

        return studentService.updateStudentDetails(studentId,student);
    }


    @DeleteMapping("/student/{id}")
    public ResponseEntity<?> deleteNote(@PathVariable(value = "id") Long studentId) {
        Student student = studentRepos.findById(studentId)
                .orElseThrow(() -> new ResourceNotFoundException("Student Not found with  ", "id", studentId));
        studentRepos.delete(student);
        return ResponseEntity.ok().build();
    }
}
