package com.example.oop.basics.access_modifiers.Bike_Challenge;

public class Main {
    public static void main(String[] args) {
        Bike bike = new Bike("romet", "rower_fajny");
        MotorBike motorBike = new MotorBike("brand", "name");
        bike.printInfo();
        motorBike.printInfo();
    }
}
