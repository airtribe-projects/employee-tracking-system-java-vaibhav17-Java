package com.example.EmployeeTrackingSystem.service;

import com.example.EmployeeTrackingSystem.model.Department;
import com.example.EmployeeTrackingSystem.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {

    @Autowired
    DepartmentRepository departmentRepository;

    public void addDepartment(Department department) {
        departmentRepository.save(department);
    }

    public Department getDepartment(long id) {
        return departmentRepository.findById(id).get();
    }

    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }

    public void updateDepartment(Department department) {
        Department existingDept = departmentRepository.findById(department.getDeptId()).get();
        if(existingDept.getDeptId() != 0) {
            existingDept.setDeptName(department.getDeptName());
            departmentRepository.save(existingDept);
        }
    }

    public void deleteDepartmentByID(long id) {
        departmentRepository.deleteById(id);
    }

}
