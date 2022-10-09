package com.hillel.loznhansky.lessons.lesson13.abstracts.partisipants;

public class Cat extends Animal {

    public Cat(String name) {
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

    public void jump() {
        System.out.println(name + " jumping...");
    }
}
