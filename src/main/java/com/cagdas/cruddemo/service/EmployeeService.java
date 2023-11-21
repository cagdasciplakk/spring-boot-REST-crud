package com.cagdas.cruddemo.service;

import com.cagdas.cruddemo.entity.Employee;
import  java.util.List;

public interface EmployeeService {

    List<Employee> findAll();

    Employee findById(int theId);

    Employee save(Employee theEmployee);

    void deleteById(int theId);
}
