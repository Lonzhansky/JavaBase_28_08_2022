package com.hillel.loznhansky.lessons.lesson15.main;

public enum TransportType {

    MOTORCYCLE("Мотоцикл"),
    CAR("Автомобiль"),
    BUS("Автобус"),
    TRUCk("Вантажiвка");

    private String title;

    TransportType(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
