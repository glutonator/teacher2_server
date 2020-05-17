package com.howtodoinjava.demo.service;

import java.util.List;

import com.howtodoinjava.demo.model.Employee;
import com.howtodoinjava.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeManagerImpl implements EmployeeManager {


    @Autowired
    EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees()
    {
        List<Employee> all = employeeRepository.findAll();
        return all;

//        return dao.getAllEmployees();
    }
}