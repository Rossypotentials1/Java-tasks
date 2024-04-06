package com.rossypotentials.spring_boot_with_react.controller;

import com.rossypotentials.spring_boot_with_react.model.EmployeeModel;
import com.rossypotentials.spring_boot_with_react.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v2/")
public class EmployeeController {
    private final EmployeeService employeeService;

    @PostMapping("employees")
    public EmployeeModel createEmployee (@RequestBody EmployeeModel employeeModel){
        return employeeService.createEmployee(employeeModel);
    }
}
