package com.hillel.loznhansky.lessons.lesson14.main;

public abstract class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    abstract void sayHello();

    public String getName() {
        return name;
    }
}
