package com.example.SpringBootRestApiWithJPA.dao;

import com.example.SpringBootRestApiWithJPA.entity.Employee;

import java.util.List;

public interface EmployeeDao {

    List<Employee> findAll();
}
