package com.example.EmployeeTrackingSystem.repository;

import com.example.EmployeeTrackingSystem.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository  extends JpaRepository<Project, Long> {

}
