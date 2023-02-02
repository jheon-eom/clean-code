package com.read.cleancode._01_method.ex_switch;

/**
 * 다형성을 이용해서 switch문을 숨긴다 !!!
 * 무조건적으로 따라야할 예는 아닌 것 같음
 */
public class EmployeeFactoryImpl implements EmployeeFactory {

    @Override
    public Employee makeEmployee(EmployeeRecord r) throws InvalidEmployeeType {
        switch (r.type) {
            case "A":
                return new CommissionedEmployee();
            default:
                throw new IllegalStateException("Unexpected value: " + r.type);
        }
    }

}
