package com.example.attendance.controller;

import com.example.attendance.model.Employee;
import com.example.attendance.service.EmployeeService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    private final EmployeeService service;

    public EmployeeController(EmployeeService service) {
        this.service = service;
    }

    @GetMapping
    public List<Employee> all() {
        return service.getAll();
    }

    @PostMapping
    public Employee add(@RequestBody Employee emp) {
        return service.save(emp);
    }
}
