package com.kodilla.collections.lists.homework;

import com.kodilla.collections.interfaces.homework.Cadillac;
import com.kodilla.collections.interfaces.homework.Car;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Cadillac> car = new ArrayList<>();
        car.add(new Cadillac(50));
        car.add(new Cadillac(75));
        car.add(new Cadillac(100));

        for (Car auto : car) {
            if (auto.getInitSpeed() > 60) {
                System.out.println(auto + ", velocity: " + auto.getInitSpeed());
            }
        }
    }
}
