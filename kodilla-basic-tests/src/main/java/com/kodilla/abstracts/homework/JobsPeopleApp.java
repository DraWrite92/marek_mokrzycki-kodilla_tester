package com.kodilla.abstracts.homework;

public class JobsPeopleApp {
    public static void main(String[] args) {
        Persona person1 = new Persona();
        person1.personData("Terry Watson", 40, new Butler());
        System.out.println("");

        Persona person2 = new Persona();
        person2.personData("Amanda Baines", 25, new Teacher());
        System.out.println("");

        Persona person3 = new Persona();
        person3.personData("Albert De Santos", 35, new Farmer());
        System.out.println("");
    }
}
