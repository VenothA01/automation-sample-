package com.dailycoder;

interface Driver{

    public void drive();
}


class CarDriver implements Driver{

    @Override
    public void drive() {
        System.out.println("driving car");
    }
}


class TruckDriver implements Driver{

    @Override
    public void drive() {
        System.out.println("driving Truck");
    }
}

public class Solution {

    public static void main(String[] args) {

        Driver driver = new CarDriver();
        System.out.println(driver instanceof TruckDriver);
        driver.drive();

    }

}
