package com.example.oop.basics.inheritance.challenge;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Dawid", "Nowak");
        Administrator administrator = new Administrator("sth", "sth", "sth");
        Programmer programmer = new Programmer("Jan", "Kowalski", "Java");

        employee.printInfo();
        administrator.printInfo();
        programmer.printInfo();
    }
}
