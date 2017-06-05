package com.hikuley.patterns.structural.adapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hikuley on 5/23/2017.
 */
public class EmployeeClient {

    public List<Employee> getEmployeeList() {
        List<Employee> employees = new ArrayList<Employee>();

        Employee employeeFromDB = new EmployeeDB("123", "Halil İbrahim", "Küley", "ssoulless@gmail.com");

        employees.add(employeeFromDB);


        EmployeeLdp employeeLdp = new EmployeeLdp("chewie", "Solo", "Han", "solo@mail.com");
        employees.add(new EmployeeAdapterLdp(employeeLdp));

        EmployeeCSV employeeCSV = new EmployeeCSV("1,halil,ibrahim,hikuley@gmail.com");
        Employee employeeCSVAdapter= new EmployeeCSVAdapter(employeeCSV);
        employees.add(employeeCSVAdapter);

        return employees;
    }


}
