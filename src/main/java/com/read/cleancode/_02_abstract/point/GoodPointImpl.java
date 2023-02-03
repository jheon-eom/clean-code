package com.read.cleancode._02_abstract.point;

public class GoodPointImpl implements GoodPoint {
    private double x;
    private double y;
    private double r;
    private double theta;

    @Override
    public double getX() {
        return x;
    }

    @Override
    public double getY() {
        return y;
    }

    @Override
    public void setCartesian(double x, double y) {

    }

    @Override
    public double getR() {
        return r;
    }

    @Override
    public double getTheta() {
        return theta;
    }

    @Override
    public void setPolar(double r, double theta) {

    }
}
