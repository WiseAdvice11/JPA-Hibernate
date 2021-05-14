package ru.a1.pagingsorting.controller;

import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.a1.pagingsorting.model.Student;
import ru.a1.pagingsorting.model.StudentPage;
import ru.a1.pagingsorting.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    @GetMapping
    public ResponseEntity<Page<Student>> getStudents(StudentPage studentPage){


        return new ResponseEntity<>(studentService.getStudents(studentPage), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Student> addStudent (@RequestBody Student student){


    return new ResponseEntity<>(studentService.addStudent(student),HttpStatus.OK);
    }
}
