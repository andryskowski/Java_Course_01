package com.example.oop.basics;

class Truck {
    String producer;
    String model;
    int amountWheels;
    String color;
    final int TOP_SPEED = 100;
    final float ACCELERATION;

    Truck() {
        producer = "Freightliner";
        model = "9664";
        amountWheels = 6;
        ACCELERATION = 60.0f;
    }

    Truck(String color) {
        this();
        this.color = color;
    }

    public void printInfo() {
        System.out.println(this.producer + " " + this.model + " " + this.color);
    }
}

public class Truck2Challenge {
    public static void main(String[] args) {
        Truck truck = new Truck("red");
        truck.printInfo();
    }
}
