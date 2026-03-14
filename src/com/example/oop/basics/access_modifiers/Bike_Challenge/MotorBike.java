package com.example.oop.basics.access_modifiers.Bike_Challenge;

public class MotorBike extends Bike {
    MotorBike(String brand, String name) {
        super(brand, name);
        this.setType("typee");
    }
    public void printInfo() {
        System.out.println("MotorBike");
        super.printInfo();
    }
}
