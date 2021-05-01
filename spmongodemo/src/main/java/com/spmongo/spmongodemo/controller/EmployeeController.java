package com.spmongo.spmongodemo.controller;

import com.spmongo.spmongodemo.model.Employee;
import com.spmongo.spmongodemo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @PostMapping("/saveEmployee")
    public String addEmployee(@RequestBody Employee employee){
        employeeRepository.save(employee);
        return "Employee added";
    }

}
