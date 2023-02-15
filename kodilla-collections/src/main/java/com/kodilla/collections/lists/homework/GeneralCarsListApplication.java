package com.kodilla.collections.lists.homework;

import com.kodilla.collections.interfaces.homework.Cadillac;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Lamborghini;
import com.kodilla.collections.interfaces.homework.Opel;

import java.util.LinkedList;
import java.util.List;

public class GeneralCarsListApplication {
    public static void main(String[] args) {
        List<Car> car = new LinkedList<>();
        car.add(new Opel(80));
        car.add(new Cadillac(120));
        car.add(new Lamborghini(200));
        car.add(new Cadillac(100));
        car.add(new Opel(50));
        car.add(new Lamborghini(170));

        car.remove(2);
        Opel opel = new Opel(50);
        car.remove(opel);

        System.out.println(car.size());
        for (Car auto : car) {
            System.out.println(auto + ", velocity: " + auto.getInitSpeed());
        }
    }
}
