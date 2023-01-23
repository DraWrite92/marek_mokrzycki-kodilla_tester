package com.kodilla.abstracts.homework;

public class CircleData2 extends Shape {
    @Override
    public double circlePerimeter(double radius) {
        double perimeter = PI * radius * 2;
        System.out.println("The perimeter of circle number two is approximately " + perimeter + ".");
        return perimeter;
    }

    @Override
    public double circleArea(double radius) {
        double area = PI * radius * radius;
        System.out.println("The area of circle number two is approximately " + area + ".");
        return area;
    }
}
