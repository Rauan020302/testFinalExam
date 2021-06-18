package com.company;

public class TaxiDriverFactory implements DriverFactory{
    @Override
    public Driver createDriver() {
        return new TaxiDriver();
    }
}
