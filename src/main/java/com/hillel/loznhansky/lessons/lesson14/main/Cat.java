package com.hillel.loznhansky.lessons.lesson14.main;

public class Cat extends Animal implements Runnable {
    public Cat(String name) {
        super(name);
    }

    @Override
    void sayHello() {
        System.out.println("Cat: " + getName() + " say hello");
    }

    @Override
    public void run() {
        System.out.println("Cat: " + getName() + " running....");
    }
}