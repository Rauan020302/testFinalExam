package com.company;

public class Main {

    public static void main(String[] args) {
        DriverFactory driverFactory = new TaxiDriverFactory();
        Driver driver = driverFactory.createDriver();
        driver.drive();
    }
}
