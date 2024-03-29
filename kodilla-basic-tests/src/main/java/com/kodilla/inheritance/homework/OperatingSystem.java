package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int year;

    public void turnOn() {
        System.out.println("System launching...");
    }

    public void turnOff() {
        System.out.println("Going dormant...");
    }

    public OperatingSystem(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void displayYear() {
        System.out.println("Year of system release: " + year);
    }
}
