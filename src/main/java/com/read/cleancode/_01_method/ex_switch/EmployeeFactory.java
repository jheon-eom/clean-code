package com.read.cleancode._01_method.ex_switch;

public interface EmployeeFactory {

    public Employee makeEmployee(EmployeeRecord r) throws InvalidEmployeeType;

}
