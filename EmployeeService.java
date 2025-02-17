package com.example.EmployeeTrackingSystem.service;

import com.example.EmployeeTrackingSystem.model.Employee;
import com.example.EmployeeTrackingSystem.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public void createEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    public Employee getEmployee(long id) {
        return employeeRepository.findById(id).get();
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public void updateEmployee(Employee employee) {
        Employee existingEmp = employeeRepository.findById(employee.getEmpId()).get();
        if(existingEmp.getEmpId() != 0) {
            existingEmp.setEmpName(employee.getEmpName());
            existingEmp.setEmail(employee.getEmail());
            existingEmp.setMobileNo(employee.getMobileNo());
            employeeRepository.save(existingEmp);
        }
    }

    public void deleteEmployeeByID(long id) {
        employeeRepository.deleteById(id);
    }
}
