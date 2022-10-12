package com.hillel.loznhansky.lessons.lesson14.main;

public class Fish extends Animal implements Swimmable {

    public Fish(String name) {
        super(name);
    }

    @Override
    void sayHello() {
        System.out.println("Fish: " + getName() + " say hello");
    }

    @Override
    public void swim() {
        System.out.println("Fish: " + getName() + " swimming....");
    }

//    @Override
//    public void demoDefault() {
////        Swimmable.super.demoDefault();
////        Demo.super.demoDefault();
//
//        System.out.println(" my realization");
//    }


//    @Override
//    public void demoDefault() {
//        System.out.println("called from Fish");
//    }
}
