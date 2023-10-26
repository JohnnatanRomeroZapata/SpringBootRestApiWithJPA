package com.example.SpringBootRestApiWithJPA.service;

import com.example.SpringBootRestApiWithJPA.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();
    Employee findById(int id);
    Employee save(Employee employee);
    void deleteById(int id);
}
