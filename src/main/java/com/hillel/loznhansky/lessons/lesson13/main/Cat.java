package com.hillel.loznhansky.lessons.lesson13.main;

public class Cat extends Animal {

    @Override
    void swim() {
        System.out.println("Cat swimming....");
    }

    @Override
    void run() {
        System.out.println("Cat running....");
    }

    public void jump() {
        System.out.println("Cat jumping...");
    }
}
