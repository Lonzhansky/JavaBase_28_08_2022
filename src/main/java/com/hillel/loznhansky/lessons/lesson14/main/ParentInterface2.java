package com.hillel.loznhansky.lessons.lesson14.main;

public interface ParentInterface2 {

    default void demoDefaultParent() {
        System.out.println("from parent2");
    }

}
