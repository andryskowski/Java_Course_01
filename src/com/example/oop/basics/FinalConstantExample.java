package com.example.oop.basics;

class PointWithConstant {
    int x, y;
    final int width = 12;
    final int height;

    PointWithConstant() {
        height = 20;
    }

    PointWithConstant(int posX, int posY) {
        this();
        x = posX;
        y = posY;
    }

    public void changePosition(int newX, final int newY) {
        newX = 30;
        x = newX;
        y = newY;
    }
}

public class FinalConstantExample {
    public static void main(String[] args) {
        PointWithConstant point = new PointWithConstant(33, 44);
        point.changePosition(55, 66);
        System.out.println("x: " + point.x + "y: " + point.y);
    }
}
