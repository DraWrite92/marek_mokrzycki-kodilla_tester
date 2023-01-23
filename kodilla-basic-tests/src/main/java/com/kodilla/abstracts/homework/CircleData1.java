package com.kodilla.abstracts.homework;

public class CircleData1 extends Shape {
    @Override
    public double circlePerimeter(double radius) {
        double perimeter = PI * radius * 2;
        System.out.println("The perimeter of circle number one is approximately " + perimeter + ".");
        return perimeter;
    }

    @Override
    public double circleArea(double radius) {
        double area = PI * radius * radius;
        System.out.println("The area of circle number one is approximately " + area + ".");
        return area;
    }
}
