package com.kodilla.collections.interfaces.homework;

public class Lamborghini implements Car {
    // This is an implementation trying to show the driving characteristic of a 1967 Lamborghini Miura P400.
    // If you don't know how that car is looking like, here's the link: https://upload.wikimedia.org/wikipedia/commons/0/0e/12-01-03-autostadtl-by-RalfR-32.jpg

    // Now, the early Lamborghinis were a big market success, performing very well and achieving the top speed of 280 km/h, which is a huge speed for their time.

    private int initSpeed;
    private int speed;

    public Lamborghini(int initSpeed) {
        this.initSpeed = initSpeed;
        this.speed = speed;
    }

    public void increaseSpeed() {
        speed = initSpeed + (initSpeed + 30);
        speed += (speed + speed);
    }

    public void decreaseSpeed() {
        speed = initSpeed + (initSpeed - 7);
        speed += speed;
    }

    public int getSpeed() {
        return speed;
    }
}
