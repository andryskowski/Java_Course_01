package com.example.oop.basics;

class Student {
    String name;
    String surname;
    String city;
    int age;

    public Student() {
        name = "Jan";
        surname = "Kowalski";
        city = "Łódź";
        age = 27;
    }

    public Student(String name, String surname, String city, int age) {
        this.name = name;
        this.surname = surname;
        this.city = city;
        this.age = age;
    }

    public void printBasicData() {
        System.out.println(this.name + " " + this.surname + " " + this.city + " " + this.age);
    }
}

public class StudentExample {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student("Dawid", "Nowak", "Warszawa", 21);
        student1.printBasicData();
        student2.printBasicData();
    }
}
