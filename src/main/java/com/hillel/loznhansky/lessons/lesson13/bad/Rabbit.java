package com.hillel.loznhansky.lessons.lesson13.bad;

public class Rabbit {

    String name;

    public Rabbit(String name) {
        this.name = name;
    }

    void run() {
        System.out.println(name + " running...");
    }

    void swim() {
        System.out.println(name + " swimming...");
    }
}
