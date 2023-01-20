package com.kodilla.inheritance.homework;

public class OperatingSystemApp {
    public static void main(String[] args) {
        OperatingSystem operatingSystem = new OperatingSystem(2022);
        operatingSystem.displayYear();

        TurnOn turnOn = new TurnOn(2022);
        turnOn.turnOn();
        System.out.println(turnOn.getYear());

        TurnOff turnOff = new TurnOff(2022);
        turnOff.turnOff();
    }
}
