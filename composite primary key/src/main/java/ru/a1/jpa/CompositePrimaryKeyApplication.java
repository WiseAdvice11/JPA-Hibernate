package ru.a1.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.a1.jpa.model.Employee;
import ru.a1.jpa.model.EmployeeIdentity;
import ru.a1.jpa.repository.EmployeeRepository;

@SpringBootApplication
public class CompositePrimaryKeyApplication implements CommandLineRunner {

    @Autowired
    private EmployeeRepository employeeRepository;

    public static void main(String[] args) {
        SpringApplication.run(CompositePrimaryKeyApplication.class, args);


    }



    @Override
    public void run(String... args) throws Exception {
        Employee employee = new Employee(new EmployeeIdentity("TheBest", "Top"),
                "Roman Pivovarov",
                "give_me_job@mail.ru",
                "+7-926-228-17-51");

        employeeRepository.save(employee);
    }
}
