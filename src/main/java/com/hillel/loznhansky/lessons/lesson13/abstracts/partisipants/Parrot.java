package com.hillel.loznhansky.lessons.lesson13.abstracts.partisipants;

public class Parrot extends Animal {

    public Parrot(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(name + " running...");
    }

    @Override
    public void swim() {
        System.out.println(name + " swimming...");
    }
}
