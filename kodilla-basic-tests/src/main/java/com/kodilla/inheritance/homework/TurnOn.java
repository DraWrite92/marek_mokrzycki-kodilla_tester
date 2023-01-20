package com.kodilla.inheritance.homework;

public class TurnOn extends OperatingSystem {
    @Override
    public void turnOn() {
        System.out.println("Uruchamianie... Witamy w systemie operacyjnym!");
    }

    public TurnOn(int year) {
        super(year);
    }
}
