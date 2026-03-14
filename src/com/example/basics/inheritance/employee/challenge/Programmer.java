package com.example.basics.inheritance.employee.challenge;

public class Programmer extends Employee {
    String languages;

    Programmer(String name, String surname, String languages) {
        this.name = name;
        this.surname = surname;
        this.languages = languages;
    }
}
