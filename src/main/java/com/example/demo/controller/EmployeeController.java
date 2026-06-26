package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping("/employee")
@CrossOrigin(origins = "*")
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @PostMapping
    public Employee save(@RequestBody Employee employee) {

        return service.save(employee);

    }

    @GetMapping
    public List<Employee> getAll() {

        return service.getAll();

    }

    @GetMapping("/{id}")
    public Employee getById(@PathVariable Integer id) {

        return service.getById(id);

    }

    @PutMapping("/{id}")
    public Employee update(@PathVariable Integer id,
            @RequestBody Employee employee) {

        return service.update(id, employee);

    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Integer id) {

        service.delete(id);

        return "Deleted Successfully";

    }

}