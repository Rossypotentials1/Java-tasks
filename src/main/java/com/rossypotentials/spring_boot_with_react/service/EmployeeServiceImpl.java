package com.rossypotentials.spring_boot_with_react.service;

import com.rossypotentials.spring_boot_with_react.entity.EmployeeEntity;
import com.rossypotentials.spring_boot_with_react.model.EmployeeModel;
import com.rossypotentials.spring_boot_with_react.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService{
    private final EmployeeRepository employeeRepository;
    @Override
    public EmployeeModel createEmployee(EmployeeModel employeeModel) {
        EmployeeEntity employeeEntity = new EmployeeEntity();
        BeanUtils.copyProperties(employeeModel, employeeEntity);

        employeeRepository.save(employeeEntity);
        return employeeModel;
    }
}


