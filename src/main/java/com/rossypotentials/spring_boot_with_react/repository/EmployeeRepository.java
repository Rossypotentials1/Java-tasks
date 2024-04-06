package com.rossypotentials.spring_boot_with_react.repository;

import com.rossypotentials.spring_boot_with_react.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity,Long> {

}
