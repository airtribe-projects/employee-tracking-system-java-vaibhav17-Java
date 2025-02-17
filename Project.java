package com.example.EmployeeTrackingSystem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Project {

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.AUTO)
    long projectId;
    String projectName;

    public Project() {

    }

    public Project(long projectId, String projectName) {
        this.projectId = projectId;
        this.projectName = projectName;
    }

    public long getProjectId() {
        return projectId;
    }

    public void setProjectId(long projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

}
