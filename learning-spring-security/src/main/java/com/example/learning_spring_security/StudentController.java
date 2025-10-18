package com.example.learning_spring_security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    @GetMapping("/students")
    public List<Student> getAllStudents() {
        return List.of(
                new Student(1, "John Doe"),
                new Student(2, "Jane Smith"),
                new Student(3, "Jim Brown")
        );
    }
}
