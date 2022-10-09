package com.hillel.loznhansky.lessons.lesson13.bad;

public class Cat {

    String name;

    public Cat(String name) {
        this.name = name;
    }

    void run() {
        System.out.println(name + " running...");
    }

    void swim() {
        System.out.println(name + " swimming...");
    }
}
