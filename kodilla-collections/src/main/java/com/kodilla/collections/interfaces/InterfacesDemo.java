package com.kodilla.collections.interfaces;

public class InterfacesDemo {
    public static void main(String[] args) {
        Square square0 = new Square(10.0);
        System.out.println(square0.getArea());
        System.out.println(square0.getPerimeter());

        Circle circle0 = new Circle(7.00);
        System.out.println(circle0.getCircleArea());
        System.out.println(circle0.getCirclePerimeter());
    }
}
