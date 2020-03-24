package com.patterns.structural.adapter;

import java.util.List;

public class AdapterDemo {
    public static void main(String[] args) {

        EmployeeClient employeeClient = new EmployeeClient();

        List<Employee> employeeList = employeeClient.getEmployeeList();
        System.out.println(employeeList);
    }
}
