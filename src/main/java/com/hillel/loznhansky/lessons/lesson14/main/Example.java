package com.hillel.loznhansky.lessons.lesson14.main;

import jdk.jfr.Percentage;

public class Example implements Demo {

    @Override
    public void demoParent() {

    }

    @Override
    public void demoDefault() {
        Demo.super.demoDefault();
    }
}
