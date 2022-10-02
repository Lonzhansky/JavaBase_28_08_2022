package com.hillel.loznhansky.lessons.lesson11;

public class Car {
    String modelName;

    public Car(String modelName) {
        this.modelName = modelName;
    }

    void startEngine() {
        System.out.println("Engine start!");
    }

    void run() {
        System.out.println(modelName + " running...");
    }

    @Override
    public String toString() {
        return "Car{" +
                "modelName='" + modelName + '\'' +
                '}';
    }
}
