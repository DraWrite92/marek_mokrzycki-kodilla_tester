package com.kodilla.abstracts.homework;

public class Persona extends Person{
    @Override
    public void personData(String name, int age, Job job) {
        System.out.println(name);
        System.out.println(age);
        job.title();
        job.salary();
        job.responsibilities();
    }
}
