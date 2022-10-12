package com.hillel.loznhansky.lessons.lesson14.main;

public interface Swimmable {

    int distance = 100;

    void swim();

    default void demoDefault() {
        System.out.println("do default ");
    }

}
