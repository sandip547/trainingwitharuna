package com.exosolve.collectionframework;

public class Employee {
    private long empId;
    private String empName;
    private double empSalary;
    private String gender;


    public Employee(long empId, String empName, double empSalary, String gender) {
        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;
        this.gender = gender;
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

    public double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
