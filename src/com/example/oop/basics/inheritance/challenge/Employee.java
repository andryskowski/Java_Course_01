package com.example.oop.basics.inheritance.challenge;

public class Employee {
    String name;
    String surname;
    Employee() {

    }
    Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    public void printInfo() {
        System.out.println("name: " + this.name + " surname: " + this.surname);
    }
}
