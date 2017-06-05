package com.hikuley.patterns.structural.adapter;

import java.util.StringTokenizer;

/**
 * Created by hikuley on 5/23/2017.
 */
public class EmployeeCSV {

    private int id;
    private String fistName;
    private String lastName;
    private String emailAddress;

    public EmployeeCSV(String values) {
        StringTokenizer stringTokenizer = new StringTokenizer(values, ",");
        if (stringTokenizer.hasMoreElements()) {
            id = Integer.parseInt(stringTokenizer.nextToken());
        }
        if (stringTokenizer.hasMoreElements()) {
            fistName = stringTokenizer.nextToken();
        }
        if (stringTokenizer.hasMoreElements()) {
            lastName = stringTokenizer.nextToken();
        }
        if (stringTokenizer.hasMoreElements()) {
            emailAddress = stringTokenizer.nextToken();
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFistName() {
        return fistName;
    }

    public void setFistName(String fistName) {
        this.fistName = fistName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

}
