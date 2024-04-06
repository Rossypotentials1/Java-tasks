package com.rossypotentials.spring_boot_with_react.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "empTable")
public class EmployeeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
}
