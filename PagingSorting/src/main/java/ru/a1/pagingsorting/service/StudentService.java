package ru.a1.pagingsorting.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import ru.a1.pagingsorting.model.Student;
import ru.a1.pagingsorting.model.StudentPage;
import ru.a1.pagingsorting.repository.StudentRepository;

@Service
public class StudentService {


    private final StudentRepository repository;

    @Autowired
    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }


    public Page<Student> getStudents(StudentPage studentPage){
        Sort sort = Sort.by(studentPage.getSortDirection(),studentPage.getSortBy());
        Pageable pageable = PageRequest.of(studentPage.getPageNumber(),
                studentPage.getPageSize(),sort);

        return repository.findAll(pageable);
    }

    public Student addStudent (Student student ){

        return repository.save(student);

    }
}
