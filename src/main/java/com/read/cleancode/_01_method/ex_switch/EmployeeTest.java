package com.read.cleancode._01_method.ex_switch;

public class EmployeeTest {

    public Employee employeeTest() throws InvalidEmployeeType {
        EmployeeRecord employeeRecord = new EmployeeRecord();
        EmployeeFactory employeeFactory = new EmployeeFactoryImpl();

        return employeeFactory.makeEmployee(employeeRecord);
    }

}
