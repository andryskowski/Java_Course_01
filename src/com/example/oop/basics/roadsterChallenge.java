package com.example.oop.basics;

class Roadster {
    float topSpeed;
    float acceleration;
    float crazyTopSpeed;
    float crazyAcceleration;

    Roadster(float topSpeed, float acceleration) {
        this.topSpeed = topSpeed;
        this.acceleration = acceleration;
    }

    Roadster(float topSpeed, float acceleration, float crazyTopSpeed, float crazyAcceleration) {
        this.topSpeed = topSpeed;
        this.acceleration = acceleration;
        this.crazyTopSpeed = crazyTopSpeed;
        this.crazyAcceleration = crazyAcceleration;
    }

    public float getTopSpeed() {
        return this.topSpeed;
    }

    public float getAcceleration() {
        return this.acceleration;
    }

    public float getTopSpeed(boolean crazyMode) {
        if (crazyMode) {
            return this.crazyTopSpeed;
        } else {
            return this.topSpeed;
        }
    }

    public float getAcceleration(boolean crazyMode) {
        if (crazyMode) {
            return this.crazyAcceleration;
        } else {
            return this.acceleration;
        }
    }
}

public class roadsterChallenge {
    public static void main(String[] args) {
        Roadster car1 = new Roadster(250.0f, 4.0f);
        System.out.println("Car1 topSpeed: " + car1.getTopSpeed());

        Roadster car2 = new Roadster(250.0f, 4.0f, 300.0f, 1.9f);
        System.out.println("Car2 crazyTopSpeed" + car2.getTopSpeed(true));
    }
}
