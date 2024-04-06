package com.rossypotentials.spring_boot_with_react.model;

import lombok.Data;

@Data
public class EmployeeModel {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
}
