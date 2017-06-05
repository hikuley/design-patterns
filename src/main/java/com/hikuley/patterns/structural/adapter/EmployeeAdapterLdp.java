package com.hikuley.patterns.structural.adapter;

/**
 * Created by hikuley on 5/23/2017.
 */
public class EmployeeAdapterLdp implements Employee {

    private EmployeeLdp instance;

    public EmployeeAdapterLdp(EmployeeLdp employeeLdp) {
        this.instance = employeeLdp;
    }

    public String getId() {
        return this.instance.getCn();
    }

    public String getFirstName() {
        return this.getFirstName();
    }

    public String getLastName() {
        return this.instance.getGivenName();
    }

    public String getEmail() {
        return this.getEmail();
    }

    public String toString() {
        return "ID:" + getId();
    }

}
