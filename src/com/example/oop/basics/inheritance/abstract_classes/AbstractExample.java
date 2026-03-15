package com.example.oop.basics.inheritance.abstract_classes;

public class AbstractExample {
    public static void main(String[] args) {
        Employee worker1 = new Employee("Adam", 32, "Kowalski");
        worker1.printInfo();
        Manager manager = new Manager("Olek", 32, "Zent", "R&D");
        manager.printInfo();

        Person person = manager;
        System.out.println(person.getName());

    }
}
