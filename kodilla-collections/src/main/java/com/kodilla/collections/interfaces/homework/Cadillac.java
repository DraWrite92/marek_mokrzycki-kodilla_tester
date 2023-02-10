package com.kodilla.collections.interfaces.homework;

public class Cadillac implements Car {
    // This is an implementation trying to show the driving characteristic of a 1967 Cadillac Sedan de Ville.
    // If you don't know how that car is looking like, here's the link: http://www.oldcarbrochures.com/static/NA/Cadillac/1967_Cadillac/1967_Cadillac_Brochure/1967%20Cadillac-12.jpg

    // Now, the cars of that era were luxurious, but also unwieldy and fuel-consuming (average 25 l/100 km). The driving experience is not as good as someone could've expected, unless you like spaciousness and rather non-dynamic driving.

    private int initSpeed;
    private int speed;

    public Cadillac(int initSpeed) {
        this.initSpeed = initSpeed;
        this.speed = speed;
    }

    public void increaseSpeed() {
        speed = initSpeed + (initSpeed + 23);
        speed += (speed + speed);
    }

    public void decreaseSpeed() {
        speed = initSpeed + (initSpeed -5);
        speed += speed;
    }

    public int getSpeed() {
        return speed;
    }
}
