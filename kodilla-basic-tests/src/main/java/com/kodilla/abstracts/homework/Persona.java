package com.kodilla.abstracts.homework;

public class Persona extends Person{
    @Override
    public void personData(String name, int age, String job) {
        System.out.println(name);
        System.out.println(age);
        System.out.println(job);
    }
}
