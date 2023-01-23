package com.kodilla.abstracts.homework;

public class Butler extends Job {
    @Override
    public void title() {
        System.out.println("Butler");
    }
    @Override
    public void salary() {
        System.out.println("$4350 per month.");
    }

    @Override
    public void responsibilities() {
        System.out.println("Greeting and checking in guests, making certain arrangements, keeping guest rooms and suites up to the standards.");
    }
}
