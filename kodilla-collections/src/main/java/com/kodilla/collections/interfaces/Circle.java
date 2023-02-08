package com.kodilla.collections.interfaces;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getCircleArea() {
        return Math.PI*radius*radius;
    }

    public double getCirclePerimeter() {
        return Math.PI*2*radius;
    }
}
