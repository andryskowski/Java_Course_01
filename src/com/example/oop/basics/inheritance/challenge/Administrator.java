package com.example.oop.basics.inheritance.challenge;

public class Administrator extends Employee {
    String certificates;

    Administrator(String name, String surname, String certificates) {
        this.name = name;
        this.surname = surname;
        this.certificates = certificates;
    }

    public void printInfo() {
        System.out.println("name: " + this.name + " surname: " + this.surname + " certificates: " + this.certificates);
    }
}
