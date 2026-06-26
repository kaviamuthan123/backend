package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    @Override
    public Employee save(Employee employee) {
        return repository.save(employee);
    }

    @Override
    public List<Employee> getAll() {
        return repository.findAll();
    }

    @Override
    public Employee getById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Employee update(Integer id, Employee employee) {

        Employee emp = repository.findById(id).orElse(null);

        if (emp != null) {

            emp.setName(employee.getName());
            emp.setAge(employee.getAge());
            emp.setCity(employee.getCity());

            return repository.save(emp);

        }

        return null;

    }

    @Override
    public void delete(Integer id) {

        repository.deleteById(id);

    }

}