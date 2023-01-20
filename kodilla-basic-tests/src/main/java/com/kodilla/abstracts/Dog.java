package com.kodilla.abstracts;

public class Dog extends Animal {

    @Override
    public void giveVoice() {
        System.out.println("Arf! Arf!");
    }

    public Dog() {
        super(4);
    }
}
