package com.example.oop.basics;

class Tv {
    String produce;
    String model;
    int yearProduction;
    String description;

    public void printBasicData() {
        System.out.println(this.produce + " " + this.model + " " + this.yearProduction + " " + this.description);
    }
}

public class TvExample {
    public static void main(String[] args) {
        Tv tv = new Tv();
        tv.produce = "Samsung";
        tv.model = "Galaxy";
        tv.yearProduction = 2005;
        tv.description = "Telewizor fajny";
        tv.printBasicData();
    }
}
