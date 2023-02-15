package com.kodilla.collections.interfaces.homework;

public class CarRace {

    public static void main(String[] args) {
        Car cadillac = new Cadillac(0);
        doRace(cadillac);

        Car lamborghini = new Lamborghini(0);
        doRace(lamborghini);

        Car opel = new Opel(0);
        doRace(opel);
        }

        private static void doRace(Car car) {
            System.out.println(car.getInitSpeed());
            car.increaseSpeed();
            car.increaseSpeed();
            car.increaseSpeed();
            System.out.println(car.getSpeed());
            car.decreaseSpeed();
            car.decreaseSpeed();
            System.out.println(car.getSpeed());
        }
    }
