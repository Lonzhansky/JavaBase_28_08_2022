package com.hillel.loznhansky.lessons.lesson13.main;

public class Fish extends Animal {

    @Override
    void swim() {
        System.out.println("Fish swimming....");
    }

    @Override
    void run() {
        System.out.println("Fish cant run");
    }

}
