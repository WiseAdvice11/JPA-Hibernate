package ru.a1.pagingsorting.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import ru.a1.pagingsorting.model.Student;

@Repository
public interface StudentRepository extends PagingAndSortingRepository<Student,Long> {


}
