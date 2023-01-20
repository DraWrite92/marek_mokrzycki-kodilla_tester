package com.kodilla.inheritance;

public class CarApplication {

    public static void main(String[] args) {
        Car car = new Car(4, 5);
        car.turnOnLights();
        car.openDoors();
        car.displayNumberOfSeats();

        Convertible convertible = new Convertible(4, 2);
        convertible.openRoof();
        convertible.closeRoof();
        convertible.openDoors();
        System.out.println(convertible.getSeats());
        convertible.displayNumberOfSeats();
    }
}
