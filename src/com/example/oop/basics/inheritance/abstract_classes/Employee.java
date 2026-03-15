package com.example.oop.basics.inheritance.abstract_classes;

public class Employee extends Person{
    public Employee(String name, int age, String surname) {
        super(name, age, surname);
    }

    @Override
    public void printInfo() {
        System.out.println("Employee: " + this.getName());
    }
}
