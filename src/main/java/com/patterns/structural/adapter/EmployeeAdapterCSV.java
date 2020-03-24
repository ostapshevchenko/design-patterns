package com.patterns.structural.adapter;


public class EmployeeAdapterCSV implements Employee {

    private EmployeeCSV employeeCSV;

    public EmployeeAdapterCSV(EmployeeCSV employeeCSV) {
        this.employeeCSV = employeeCSV;
    }

    @Override
    public String getId() {
        return employeeCSV.getId() + "";
    }

    @Override
    public String getName() {
        return employeeCSV.getFirstName();
    }

    @Override
    public String getLastName() {
        return employeeCSV.getLastName();
    }

    @Override
    public String getEmail() {
        return employeeCSV.getEmailAddress();
    }
}
