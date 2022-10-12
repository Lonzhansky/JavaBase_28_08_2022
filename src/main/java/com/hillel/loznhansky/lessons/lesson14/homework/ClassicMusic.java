package com.hillel.loznhansky.lessons.lesson14.homework;

public class ClassicMusic extends MusicStyles {
    public ClassicMusic(String name) {
        super(name);
    }

    @Override
    void playMusic() {
        System.out.println("playing classic music");
    }
}
