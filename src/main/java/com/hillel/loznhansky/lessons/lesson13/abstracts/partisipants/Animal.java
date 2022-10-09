package com.hillel.loznhansky.lessons.lesson13.abstracts.partisipants;

public abstract class Animal {

    String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void run();

    public abstract void swim();
}
