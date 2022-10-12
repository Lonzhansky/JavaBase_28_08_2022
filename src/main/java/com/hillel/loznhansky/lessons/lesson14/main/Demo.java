package com.hillel.loznhansky.lessons.lesson14.main;

public interface Demo extends ParentInterface, ParentInterface2 {


    @Override
    default void demoDefaultParent() {
        ParentInterface.super.demoDefaultParent();
        ParentInterface2.super.demoDefaultParent();

        System.out.println("sdfsdfsd");
    }
}
