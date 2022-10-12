package com.hillel.loznhansky.lessons.lesson14.main;

public interface ParentInterface {

    void demoParent();

    default void demoDefaultParent() {
        System.out.println("from parent");
    }

    default void demoDefault() {
        System.out.println("do default from parent");
    }

}
