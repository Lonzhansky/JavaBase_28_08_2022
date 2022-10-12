package com.hillel.loznhansky.lessons.lesson14.homework;

public abstract class MusicStyles {

    private String name;

    public MusicStyles(String name) {
        this.name = name;
    }

    abstract void playMusic();
}
