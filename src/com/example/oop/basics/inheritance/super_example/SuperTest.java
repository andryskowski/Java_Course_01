package com.example.oop.basics.inheritance.super_example;

public class SuperTest {
    public static void main(String[] args) {
        Student student = new Student("Ania", "Kowalsak", 5);
        Teacher teacher = new Teacher("Adam", "Dobrzyński", "biology");
        Director director = new Director("Anna", "Zabłocka", 1);
        System.out.println(teacher.getTeachingSubject());
    }
}
