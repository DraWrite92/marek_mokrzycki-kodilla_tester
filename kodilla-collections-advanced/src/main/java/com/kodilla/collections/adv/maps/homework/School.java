package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Integer> classes = new ArrayList<>();

    public School(List<Integer> classes) {
        this.classes = classes;
    }

    public double getAverageNumber() {
        double sum = 0.0;
        for(double classe : classes) {
            sum += classe;
        }
        return sum/classes.size();
    }

    @Override
    public String toString() {
        return "Number of pupils in school's classes: " + classes.toString();
    }
}
