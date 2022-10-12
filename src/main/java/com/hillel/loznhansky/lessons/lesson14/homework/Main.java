package com.hillel.loznhansky.lessons.lesson14.homework;

public class Main {
    public static void main(String[] args) {

//        MusicStyles[] musicStyles = {
//                new PopMusic("Kalush"),
//                new ClassicMusic("Beethoven"),
//                null
//        };

        MusicStyles[] musicStyles = null;

        if (musicStyles != null) {
            for (MusicStyles musicStyle : musicStyles) {
                if (musicStyle != null) {
                    musicStyle.playMusic();
                }
            }
        }


    }
}
