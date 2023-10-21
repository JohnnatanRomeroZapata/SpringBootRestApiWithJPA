package com.example.SpringBootRestApiWithJPA.controller;

import com.example.SpringBootRestApiWithJPA.dao.EmployeeDao;
import com.example.SpringBootRestApiWithJPA.entity.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("/api")
public class EmployeeController {

    private EmployeeDao employeeDao;

    public EmployeeController(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    @GetMapping("/employees")
    public List<Employee> findAll(){
        return employeeDao.findAll();
    }

}
