package com.example.basics.inheritance.example2_shop;

public class Shop {
    public static void main(String[] args) {
        Mouse mouse = new Mouse();
        VerticalMouse vMouse = new VerticalMouse();
        Monitor monitor = new Monitor();
        Keyboard keyboard = new Keyboard();
        Computer computer = new Computer();
        System.out.println(computer.monitor.resolution);

        System.out.println("keyboard price: " + keyboard.price);
        System.out.println("computer price " + computer.price);
    }
}
