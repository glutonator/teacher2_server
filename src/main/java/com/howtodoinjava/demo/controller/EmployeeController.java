package com.howtodoinjava.demo.controller;

import com.howtodoinjava.demo.model.EmployeeVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.howtodoinjava.demo.service.EmployeeManager;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeManager manager;

    @RequestMapping(value = "/getAllEmployees", method = RequestMethod.GET)
    @CrossOrigin(origins = "http://localhost:4200")
    public List<EmployeeVO> getAllEmployees() {
        return manager.getAllEmployees();
    }
}
