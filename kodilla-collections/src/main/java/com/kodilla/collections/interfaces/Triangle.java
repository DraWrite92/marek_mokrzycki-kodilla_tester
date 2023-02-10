package com.kodilla.collections.interfaces;

public class Triangle implements Shape {
    private double height;
    private double width;
    private double hypotenuse;

    public Triangle(double height, double width, double hypotenuse) {
        this.height = height;
        this.width = width;
        this.hypotenuse = hypotenuse;
    }

    @Override
    public double getArea() {
        return 0.5 * width * height;
    }

    @Override
    public double getPerimeter() {
        return width + height + hypotenuse;
    }
}
