package ru.a1.jpa.model;

import com.sun.istack.NotNull;
import jdk.jfr.Enabled;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.NaturalId;

import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "employee",schema = "myschema")
public class Employee {

    @EmbeddedId
    private EmployeeIdentity employeeIdentity;

    @NotNull
    @Size(max = 60)
    private String Name;

    @NaturalId
    @NotNull
    @Email
    @Size(max = 60)
    private String email;

    @Size(max = 20)
    private String phoneNumber ;







}
