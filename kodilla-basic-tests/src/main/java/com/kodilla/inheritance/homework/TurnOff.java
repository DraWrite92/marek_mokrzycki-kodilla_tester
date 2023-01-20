package com.kodilla.inheritance.homework;

public class TurnOff extends OperatingSystem {
    @Override
    public void turnOff() {
        System.out.println("Kończenie... Można teraz bezpiecznie wyłączyć komputer.");
    }

    public TurnOff(int year) {
        super(year);
    }
}
