package com.example.EmployeeTrackingSystem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.AUTO)
    long empId;
    String empName;
    String email;
    String role;
    int mobileNo;

    public Employee() {

    }

    public Employee(long empId, String empName, String email, int mobileNo) {
        this.empId = empId;
        this.empName = empName;
        this.email = email;
        this.mobileNo = mobileNo;
    }

    public long getEmpId() {
        return empId;
    }

    public void setEmpId(long empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(int mobileNo) {
        this.mobileNo = mobileNo;
    }

}
