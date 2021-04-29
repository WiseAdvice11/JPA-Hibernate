package ru.a1.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.a1.jpa.model.Employee;
import ru.a1.jpa.model.EmployeeIdentity;

import java.util.List;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, EmployeeIdentity> {


    List<Employee> findByEmployeeIdentityCompanyId(String companyId);

}
