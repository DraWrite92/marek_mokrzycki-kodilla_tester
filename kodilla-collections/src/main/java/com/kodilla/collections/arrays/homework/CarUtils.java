package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Cadillac;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Lamborghini;
import com.kodilla.collections.interfaces.homework.Opel;

public class CarUtils {
    public static void describeCar (Car car) {
        System.out.println("------------------------------");
        System.out.println("Car brand: " + getCarInfo(car));
        System.out.println("Car's acceleration: " + car.getInitSpeed());
    }

    private static String getCarInfo (Car car) {
        if (car instanceof Cadillac)
            return "Cadillac";
        else if (car instanceof Lamborghini)
            return "Lamborghini";
        else if (car instanceof Opel)
            return "Opel";
        else
            return "Unknown car brand";
    }
}
