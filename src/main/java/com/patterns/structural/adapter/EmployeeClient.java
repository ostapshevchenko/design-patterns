package com.patterns.structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {

    public List<Employee> getEmployeeList() {
        List<Employee> employees = new ArrayList<>();

        Employee employeeFromDb = new EmployeeDb("1234","john", "Wick", "jochnwick@gmail.com");
        employees.add(employeeFromDb);
// wil not work
//        Employee employeeFromLdap = new EmployeeLdap("1234","john", "Wick", "jochnwick@gmail.com");
        EmployeeLdap employeeLdap = new EmployeeLdap("ldap", "solo", "Han", "Hank@gmail.com");
        employees.add(new EmployeeAdapterLdap(employeeLdap));

        EmployeeCSV employeeCSV = new EmployeeCSV("567,Sherlock Holmes, sherlock@gmail.com");
        employees.add(new EmployeeAdapterCSV(employeeCSV));

        return employees;
    }
}
