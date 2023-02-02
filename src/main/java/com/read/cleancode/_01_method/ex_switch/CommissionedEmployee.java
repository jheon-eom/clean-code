package com.read.cleancode._01_method.ex_switch;

public class CommissionedEmployee extends Employee {

    @Override
    public boolean isPayday() {
        return false;
    }

    @Override
    public Money calculatePay() {
        return null;
    }

    @Override
    public void deliverPay(Money pay) {

    }

}
