package com.driver;

public class Main {
    public static void main(String[] args) {
//        F1 mercedes = new F1("mercedes", false);
//        mercedes.move(40, 0);
//        mercedes.accelerate(20);
//        mercedes.accelerate(-60);

        Vehicle vehicle = new Vehicle("Truck");

//        assert vehicle.getName() == "Truck";

//        assert vehicle.getCurrentDirection() == 0;

//        assert vehicle.getCurrentSpeed() == 0;

        vehicle.move(10, 45);

//        assert vehicle.getCurrentSpeed() == 10;
//
//        assert vehicle.getCurrentDirection() == 45;

        vehicle.steer(45);

//        assert vehicle.getCurrentDirection() == 90;
//
//        assert vehicle.getCurrentSpeed() == 10;

        vehicle.stop();

//        assert vehicle.getCurrentSpeed() == 0;
    }
}