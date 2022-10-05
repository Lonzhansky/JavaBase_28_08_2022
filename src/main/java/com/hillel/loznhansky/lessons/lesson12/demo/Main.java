package com.hillel.loznhansky.lessons.lesson12.demo;

import com.hillel.loznhansky.lessons.lesson12.Car;
import com.hillel.loznhansky.lessons.lesson12.CarChild;

public class Main {
    public static void main(String[] args) {

//        Person person = new Person("Den", 28);
//
//        person.age = 10;
//
//        person.increaseAge();
//
//        person.defaultVariable = 10;
//
//        System.out.println(person);


        Car car = new Car("BMW");

        car.start();
//        car.stop();

        // ERROR!
//        car.name = "Mercedes";

        CarChild car2 = new CarChild("BMW");

        car2.start();
        car2.stop();
    }
}
