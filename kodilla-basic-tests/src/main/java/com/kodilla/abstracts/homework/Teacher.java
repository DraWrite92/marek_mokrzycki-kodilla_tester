package com.kodilla.abstracts.homework;

public class Teacher extends Job {
    @Override
    public void title() {
        System.out.println("Teacher");
    }
    @Override
    public void salary() {
        System.out.println("$4655 per month.");
    }

    @Override
    public void responsibilities() {
        System.out.println("Preparing lesson plans, educating students according to the programme, encouraging students to gain knowledge and skills.");
    }
}
