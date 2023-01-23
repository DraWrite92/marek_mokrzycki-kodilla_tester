package com.kodilla.abstracts.homework;

public class JobsPeopleApp {
    public static void main(String[] args) {
        Persona person1 = new Persona();
        person1.personData("Terry Watson", 40, "Butler");
        Butler butler = new Butler();
        butler.salary();
        butler.responsibilities();
        System.out.println("");

        Persona person2 = new Persona();
        person2.personData("Amanda Baines", 25, "Teacher");
        Teacher teacher = new Teacher();
        teacher.salary();
        teacher.responsibilities();
        System.out.println("");

        Persona person3 = new Persona();
        person3.personData("Albert De Santos", 35, "Farmer");
        Farmer farmer = new Farmer();
        farmer.salary();
        farmer.responsibilities();
        System.out.println("");
    }
}
