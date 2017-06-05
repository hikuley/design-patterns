package com.hikuley.patterns.structural.adapter;

/**
 * Created by hikuley on 5/23/2017.
 */
public class EmployeeCSVAdapter implements Employee {

    private EmployeeCSV instance;

    public EmployeeCSVAdapter(EmployeeCSV employeeCSV) {
        this.instance = employeeCSV;
    }

    public String getId() {
        return instance.getId() + "";
    }

    public String getFirstName() {
        return instance.getFistName();
    }

    public String getLastName() {
        return instance.getLastName();
    }

    public String getEmail() {
        return instance.getEmailAddress();
    }
}
