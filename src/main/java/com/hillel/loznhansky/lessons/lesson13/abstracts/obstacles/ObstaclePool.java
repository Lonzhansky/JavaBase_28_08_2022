package com.hillel.loznhansky.lessons.lesson13.abstracts.obstacles;

import com.hillel.loznhansky.lessons.lesson13.abstracts.partisipants.Animal;

public class ObstaclePool extends Obstacles {

    @Override
    public void start(Animal animal) {
        animal.swim();
    }
}
