package com.company;

public class PlaneDriverFactory implements DriverFactory{
    @Override
    public Driver createDriver() {
        return new PlaneDriver();
    }
}
