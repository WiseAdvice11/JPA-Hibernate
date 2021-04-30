package ru.a1.jpa.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class EmployeeIdentity implements Serializable {

    @NotNull
    @Size(max = 20)
    private String EmployeeId;

    @NotNull
    @Size (max = 20)
    private String companyId;


}
