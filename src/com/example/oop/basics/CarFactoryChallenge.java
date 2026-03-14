package com.example.oop.basics;

import java.util.Random;

class Car2 {
    String model;
    String brand;
    String color;

    Car2(String model, String brand, String color) {
        this.model = model;
        this.brand = brand;
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public void printInfo() {
        System.out.println(this.brand + " " + this.model + " " + this.color);
    }
}

class CarFactory {
    public Car2 buildCar() {
        String[] colors = {"czerwony", "czarny", "biały"};
        Random random = new Random();
        String randomColor = colors[random.nextInt(colors.length)];
//        int randIndex = (int) Math.floor(Math.random() * colors.length);
//        String randColor = colors[randIndex];
        Car2 car = new Car2("Ford", "Mustang", randomColor);
        return car;
    }
}

public class CarFactoryChallenge {
    public static void main(String[] args) {
        CarFactory cf = new CarFactory();
        Car2 carSth = cf.buildCar();
        carSth.printInfo();

    }
}
