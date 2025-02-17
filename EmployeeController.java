package com.example.EmployeeTrackingSystem.controller;

import com.example.EmployeeTrackingSystem.model.Employee;
import com.example.EmployeeTrackingSystem.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping
    public String greetingMessage() {
        return "Welcome to EmployeeTrackingSystem";
    }

    // inserting employee
    @PostMapping("/employees")
    public void addEmployee(@RequestBody Employee employee) {
        employeeService.createEmployee(employee);
    }

    // displaying employee by id
    @GetMapping("/employees/{id}")
    public Employee getEmployee(@PathVariable Long id){
        return employeeService.getEmployee(id);
    }

    // displaying list of all employees
    @GetMapping("/employees")
    public List<Employee> getAllEmployee() {
        return employeeService.getAllEmployees();
    }

    //updating employee by id
    @PutMapping("/employees")
    public void updateEmployee(@RequestBody Employee employee){
        employeeService.updateEmployee(employee);
    }

    // deleting employee by id
    @DeleteMapping("/employees/{id}")
    public void deleteEmployeeByID(@PathVariable long id){
        employeeService.deleteEmployeeByID(id);
    }

}
