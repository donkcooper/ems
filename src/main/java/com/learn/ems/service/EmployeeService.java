package com.learn.ems.service;

import com.learn.ems.model.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployees();
    public Employee getEmployeeById(long employeeId);
}
