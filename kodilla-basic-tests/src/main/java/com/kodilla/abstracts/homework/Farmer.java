package com.kodilla.abstracts.homework;

public class Farmer extends Job {
    @Override
    public void salary() {
        System.out.println("$3780 per month, but that varies.");
    }

    @Override
    public void responsibilities() {
        System.out.println("Performing maintenance on the farm, planting, fertilizing and harvesting crops, raising and caring for livestock.");
    }
}
