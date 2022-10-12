package com.hillel.loznhansky.lessons.lesson14.main;

public class Dog extends Animal implements Swimmable, Runnable, Cloneable {

    public Dog(String name) {
        super(name);
    }

    @Override
    void sayHello() {
        System.out.println("Dog: " + getName() + " say hello");
    }

    @Override
    public void swim() {
        System.out.println("Dog: " + getName() + " swimming....");
    }

    @Override
    public void run() {
        System.out.println("Dog: " + getName() + " running....");
    }
}
