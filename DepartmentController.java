package com.example.EmployeeTrackingSystem.controller;

import com.example.EmployeeTrackingSystem.model.Department;
import com.example.EmployeeTrackingSystem.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    // inserting department
    @PostMapping("/departments")
    public void addDepartment(@RequestBody Department department){
        departmentService.addDepartment(department);
    }

    // displaying department by id
    @GetMapping("/departments/{id}")
    public Department getDepartment(@PathVariable long id){
        return departmentService.getDepartment(id);
    }

    // displaying list of all department
    @GetMapping("/departments")
    public List<Department> getAllDepartment(){
        return departmentService.getAllDepartments();
    }

    // updating department by id
    @PutMapping("/departments")
    public void updateDepartment(@RequestBody Department department){
        departmentService.updateDepartment(department);
    }

    // deleting department by id
    @DeleteMapping("/departments/{id}")
    public void deleteDepartmentByID(@PathVariable long id){
        departmentService.deleteDepartmentByID(id);
    }

}
