package com.example.oop.basics.inheritance.abstract_classes;

public class Manager extends Employee {
    private String departmentName;

    public Manager(String name, int age, String surname, String departmentName) {
        super(name, age, surname);
        this.departmentName = departmentName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}
