package com.example.SpringBootRestApiWithJPA.service;

import com.example.SpringBootRestApiWithJPA.repo.EmployeeRepo;
import com.example.SpringBootRestApiWithJPA.repo.EmployeeRepoImpl;
import com.example.SpringBootRestApiWithJPA.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    private final EmployeeRepo employeeRepo;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepoImpl employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepo.findAll();
    }

    @Override
    public Employee findById(int id) {
        return employeeRepo.findById(id);
    }

    @Override
    @Transactional
    public Employee save(Employee employee) {
        return employeeRepo.save(employee);
    }

    @Override
    @Transactional
    public void deleteById(int id) {
        employeeRepo.deleteById(id);
    }
}
