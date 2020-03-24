package com.patterns.structural.adapter;

public class EmployeeAdapterLdap implements Employee {

    private EmployeeLdap instance;

    public EmployeeAdapterLdap(EmployeeLdap employeeLdap) {
        this.instance = employeeLdap;
    }

    @Override
    public String getId() {
        return instance.getCn();
    }

    @Override
    public String getName() {
        return instance.getGivenName();
    }

    @Override
    public String getLastName() {
        return instance.getSurname();
    }

    @Override
    public String getEmail() {
        return instance.getMail();
    }
}
