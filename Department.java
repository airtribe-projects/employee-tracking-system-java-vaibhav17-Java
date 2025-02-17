package com.example.EmployeeTrackingSystem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Department {

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.AUTO)
    long deptId;
    String deptName;

    public Department() {

    }

    public Department(long deptId, String deptName) {
        this.deptId = deptId;
        this.deptName = deptName;
    }

    public long getDeptId() {
        return deptId;
    }

    public void setDeptId(long deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

}
