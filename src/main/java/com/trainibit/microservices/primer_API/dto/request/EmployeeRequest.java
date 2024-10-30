package com.trainibit.microservices.primer_API.dto.request;

import com.trainibit.microservices.primer_API.entity.Departamento;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public class EmployeeRequest {

    private String firstName;
    private String lastName;
    private String emailId;
    private String password;
    private DepartamentoRequest area;
    private List<UUID> roles;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public DepartamentoRequest getArea() {
        return area;
    }

    public void setArea(DepartamentoRequest area) {
        this.area = area;
    }

    public List<UUID> getRoles() {
        return roles;
    }

    public void setRoles(List<UUID> roles) {
        this.roles = roles;
    }
}

