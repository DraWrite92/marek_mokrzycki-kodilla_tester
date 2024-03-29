package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Cadillac;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Lamborghini;
import com.kodilla.collections.interfaces.homework.Opel;

import java.util.Random;

public class CarsApplication {

    public static void main(String[] args) {
        Random random = new Random();
        Car[] cars = new Car[random.nextInt(15) + 1];
        for (int x = 0; x < cars.length; x++)
            cars[x] = drawCar();
        for (Car car : cars)
            CarUtils.describeCar(car);
    }

    public static Car drawCar() {
        Random random = new Random();
        int drawnCarBrand = random.nextInt(3);
        int a = getRandomSpeed(random);
            if (drawnCarBrand == 0)
                return new Cadillac(a);
            else if (drawnCarBrand == 1)
                return new Lamborghini(a);
            else
                return new Opel(a);
    }

    private static int getRandomSpeed(Random random) {
        return random.nextInt(160);
    }
}
