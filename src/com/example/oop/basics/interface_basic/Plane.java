package com.example.oop.basics.interface_basic;

import com.example.oop.basics.interface_basic.Vehicle;

public class Plane implements Vehicle, Flying {
    @Override
    public void move() {
        System.out.println("Plane is moving");
    }

    @Override
    public void stop() {
        System.out.println("Plane stopped");
    }

    @Override
    public void turn() {
        System.out.println("Plane turned");
    }

    @Override
    public float getTopSpeed() {
        return 800;
    }

    public void flyAsPlane() {

    }

    @Override
    public void increaseHeight() {
        System.out.println("Plane is increasing height");
    }

    @Override
    public void decreaseHeight() {
        System.out.println("Plane decreasing height");
    }
}