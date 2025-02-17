package com.example.EmployeeTrackingSystem.repository;

import com.example.EmployeeTrackingSystem.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
