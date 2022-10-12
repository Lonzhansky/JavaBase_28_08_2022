package com.hillel.loznhansky.lessons.lesson14.task;

public class Boat implements Swimmable, Transportable {
    @Override
    public void swim() {
        System.out.println("Boat swimming...");
    }

    @Override
    public void trasport() {
        System.out.println("do something");
    }
}
