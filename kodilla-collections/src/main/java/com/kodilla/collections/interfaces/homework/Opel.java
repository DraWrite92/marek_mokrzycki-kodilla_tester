package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

public class Opel implements Car {
    // This is an implementation trying to show the driving characteristic of a 1967 Opel Rekord C Sedan.
    // If you don't know how that car is looking like, here's the link: https://upload.wikimedia.org/wikipedia/commons/6/62/Opel_Rekord_C_1900_L_white_1967.jpg

    // Now, the Rekord C was Opel's most successful car at the time in terms of sales, and it was quite an universal car for the West German market, especially.

    private int initSpeed;
    private int speed;

    public Opel(int initSpeed) {
        this.initSpeed = initSpeed;
        this.speed = speed;
    }

    public void increaseSpeed() {
        speed = initSpeed + (initSpeed + 11);
        speed += (speed + speed);
    }

    public void decreaseSpeed() {
        speed = initSpeed + (initSpeed - 6);
        speed += speed;
    }

    public int getSpeed() {
        return speed;
    }

    public int getInitSpeed() {
        return initSpeed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Opel opel = (Opel) o;
        return initSpeed == opel.initSpeed && speed == opel.speed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(initSpeed, speed);
    }

    @Override
    public String toString() {
        return "Opel{" +
                "initSpeed=" + initSpeed +
                ", speed=" + speed +
                '}';
    }
}
