package com.hillel.loznhansky.lessons.lesson15.nested;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("BMW");

        car.door.rollUp();


        Car.Engine engine = new Car.Engine();
        engine.start();
    }
}
