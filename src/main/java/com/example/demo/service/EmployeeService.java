package com.example.demo.service;

import java.util.List;
import com.example.demo.entity.Employee;

public interface EmployeeService {

    Employee save(Employee employee);

    List<Employee> getAll();

    Employee getById(Integer id);

    Employee update(Integer id, Employee employee);

    void delete(Integer id);

}