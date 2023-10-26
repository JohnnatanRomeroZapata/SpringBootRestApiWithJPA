package com.example.SpringBootRestApiWithJPA.repo;

import com.example.SpringBootRestApiWithJPA.entity.Employee;

import java.util.List;

public interface EmployeeRepo {

    List<Employee> findAll();
    Employee findById(int id);
    Employee save(Employee employee);
    void deleteById(int id);
}
