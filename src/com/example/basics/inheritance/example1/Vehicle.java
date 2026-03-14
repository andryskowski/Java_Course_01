package com.example.basics.inheritance.example1;

public class Vehicle {
    public String type;
    public String manufacturer;
    public float topSpeed;

    Vehicle() {
        type = "unknown";
        manufacturer = "uknonwn";
        topSpeed = 0;
    }

    public void printInfo() {
        System.out.println("type: " + type + " manufacturer: " + manufacturer + " topSpeed: " + topSpeed);
    }
}
