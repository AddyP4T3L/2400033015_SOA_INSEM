package com.klu.testing;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/student/grade/{marks}")
    public String getGrade(@PathVariable("marks") int marks) {
        return studentService.calculateGrade(marks);
    }
}